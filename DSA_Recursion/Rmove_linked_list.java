public class Rmove_linked_list {
    public static void main(String[] args) {
        // Example 
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);

        int valToRemove = 6;

        Solution solution = new Solution();
        ListNode newHead = solution.removeElements(head, valToRemove);

        // Print the resulting linked list
        ListNode current = newHead;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
    }
}


/* Q : Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.  */