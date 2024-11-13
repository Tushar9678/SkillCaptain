public class RemoveMiddle {
    int data;
    RemoveMiddle next;

    public RemoveMiddle(int data) {
        this.data = data;
        this.next = null;
    }

    public RemoveMiddle(int data, RemoveMiddle next) {
        this.data = data;
        this.next = next;
    }

    public static void main(String[] args) {
        
        RemoveMiddle node7 = new RemoveMiddle(6);
        RemoveMiddle node6 = new RemoveMiddle(2, node7);
        RemoveMiddle node5 = new RemoveMiddle(1, node6);
        RemoveMiddle node4 = new RemoveMiddle(7, node5);
        RemoveMiddle node3 = new RemoveMiddle(4, node4);
        RemoveMiddle node2 = new RemoveMiddle(3, node3);
        RemoveMiddle head = new RemoveMiddle(1, node2);

       
        RemoveMiddle result = removeMiddle(head);

        
        while (result != null) {
            System.out.print(result.data + " ");
            result = result.next;
        }
    }

    
    private static RemoveMiddle removeMiddle(RemoveMiddle head) {
        // If the list has only one node, return null
        if (head == null || head.next == null) {
            return null;
        }

        RemoveMiddle fast = head, slow = head, prev = null;

        // Using slow and fast pointers to find the middle
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // slow is now pointing to the middle node, remove it
        if (prev != null) {
            prev.next = slow.next;
        }

        return head;
    }
}
