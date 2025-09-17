public class SwapNodePairs {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Time Complexity: O(n) where n is the number of nodes in the linked list.
    // Space Complexity: O(1) as we are not using any extra space for swapping
    public static ListNode swap(ListNode head) {
        ListNode curr = head;
        
        while (curr != null && curr.next != null) {
            int temp = curr.val;
            curr.val = curr.next.val;
            curr.next.val = temp;

            // update the curr for the next pair so that all the pairs can be swap one by one
            curr = curr.next.next;
        }
        return head;
    }
    
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        
        // Print original list
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + "--->");
            curr = curr.next;
        }
        System.err.print("null");

        System.out.println();

        ListNode swappedHead = swap(head);
        // Print swapped list
        curr = swappedHead;
        while (curr != null) {
            System.out.print(curr.val + "--->");
            curr = curr.next;
        }
        System.err.print("null");
    }
}
