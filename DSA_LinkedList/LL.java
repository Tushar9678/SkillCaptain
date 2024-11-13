public class LL{

    private Node head;
    private Node tail;

    private int size;

    public LL(){
        this.size = 0;
    }



    //Insert node to first position of link list
    public void  insertfirst(int val){
        Node node = new Node(val);
        node.next = head;
        head=node;

        if(tail==null){
            tail=head;
        }
        size +=1;
    }
    
    //Insert node to last position of link list
    public void insertlast(int val){

        if(tail == null){
            insertfirst(val);
            return;
        }

        Node node = new Node(val);
        tail.next= node;
        tail = node;
        size++;
    }

        //Insert node to particular position of link list
        public void insert(int val, int index){

            if(index == 0){
                insertfirst(val);
                size++;
            }

            if(index == size){
                insertlast(val);
                size++;
            }

            Node temp = head;
            for(int i=1; i<index; i++){
                temp = temp.next;
            }

            Node node = new Node(val, temp.next);
            temp.next = node;
            size++;

        }



    // display link list
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+"->");
            temp = temp.next;
        }
        System.out.print("END");
    }



    private class Node{
        int val;
        Node next;


        public Node(int val){
            this.val=val;
        }

        public Node(int val, Node next){
            this.val = val;
            this.next = next;
        }

    }


    public static void main(String[] args){
        LL list = new LL();
        list.insertfirst(3);
        list.insertfirst(2);
        list.insertfirst(1);
        list.insertfirst(0);

        list.insertlast(4);
        list.insertlast(5);

        list.insert(100, 3);

        list.display();

    }
}
