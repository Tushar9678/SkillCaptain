public class LinkedListReverse{
    int data;
    LinkedListReverse next;

    public LinkedListReverse(int data){
        this.data = data;
        this.next = null;
    }

    public LinkedListReverse(int data, LinkedListReverse next){
        this.data = data;
        this.next = next;
    }

    public static void main(String [] args){
        LinkedListReverse node4 = new LinkedListReverse(4);
        LinkedListReverse node3 = new LinkedListReverse(3, node4);
        LinkedListReverse node2 = new LinkedListReverse(2, node3);
        LinkedListReverse head = new LinkedListReverse(1, node2);

        LinkedListReverse reverse = reverselist(head);
        printlist (reverse);

    }

    private static LinkedListReverse reverselist(LinkedListReverse head){
        LinkedListReverse prev = null;
        LinkedListReverse next = null;
        LinkedListReverse current = head;

        while(current!= null){
           next = current.next;
           current.next = prev;
           prev = current;
           current = next;
        }
        return prev; // New head of the reversed linked list
    }

    private static void printlist(LinkedListReverse head){
        while(head != null){
            System.out.println(head.data +" ");
            head = head.next;    
        }
        System.out.println();
    }
}