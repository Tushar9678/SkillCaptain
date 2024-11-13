public class LinkedList{
    int data;
    LinkedList next;

    public LinkedList(int data){
        this.data = data;
        this.next = null;
    }

    public LinkedList(int data, LinkedList next){
        this.data = data;
        this.next = next;
    }

    public static void main(String[] args){
        LinkedList llnextnext = new LinkedList(5, null);
        LinkedList llnext = new LinkedList(3, llnextnext);
        LinkedList ll = new LinkedList(2,llnext);
       
        getlength(ll);
    }

    private static void getlength(LinkedList head){
        int length = 0;
        while(head != null){
            System.out.print(head.data + "-> ");
            head = head.next;
            length++;
        }
        System.out.println("\nlength : " + length);
    }

}