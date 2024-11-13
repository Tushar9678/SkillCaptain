public  class LinkedListMiddle{
    int data;
    LinkedListMiddle next;

    public LinkedListMiddle(int data){
        this.data = data;
        this.next = null;
    }

    public LinkedListMiddle(int data, LinkedListMiddle next){
        this.data = data;
        this.next = next;
    }

    public static void main(String[] args){
        LinkedListMiddle node5 = new LinkedListMiddle(5);
        LinkedListMiddle node4 = new LinkedListMiddle(4, node5);
        LinkedListMiddle node3 = new LinkedListMiddle(3, node4);
        LinkedListMiddle node2 = new LinkedListMiddle(2, node3);
        LinkedListMiddle head = new LinkedListMiddle(1,node2);

        LinkedListMiddle middle = middleNode(head);

        while(middle != null){
            System.out.println(middle.data +" ");
            middle = middle.next;
        }
        
    }

    private static LinkedListMiddle middleNode(LinkedListMiddle head){
        LinkedListMiddle slow = head , fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}