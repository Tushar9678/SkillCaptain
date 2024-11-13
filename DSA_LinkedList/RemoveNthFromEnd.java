public class RemoveNthFromEnd{
    int data;
    RemoveNthFromEnd next;

    public RemoveNthFromEnd(int data){
        this.data = data;
        this.next = null;
    }

    public RemoveNthFromEnd(int data, RemoveNthFromEnd next){
        this.data = data;
        this.next = next;
    }

    public static void main(String[] args){
        
        RemoveNthFromEnd node5 = new RemoveNthFromEnd(5);
        RemoveNthFromEnd node4 = new RemoveNthFromEnd(4, node5);
        RemoveNthFromEnd node3 = new RemoveNthFromEnd(3, node4);
        RemoveNthFromEnd node2 = new RemoveNthFromEnd(2, node3);
        RemoveNthFromEnd head = new RemoveNthFromEnd(1, node2);

        int n = 2;
        RemoveNthFromEnd removed = remove(head, n);


        if(removed == null){
            System.out.println("List is empty.");
        }else{
            while (removed != null) {
                System.out.print(removed.data + " ");
                removed = removed.next;
            }
        }
    }
    private static RemoveNthFromEnd remove(RemoveNthFromEnd head, int n){
        RemoveNthFromEnd temp = head; //dummy node

        //calculate length of LL
        int length = 0;
        while(temp != null){
            length++;
            temp = temp.next;
        }

        int steps = length-n;

        if(steps == 0){
            return head.next; //special case(first value removed)
        }

        temp = head;
        for(int i=1; i<steps; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next; //skip target node
        return head;
    }
}