public class MergeTwoSortedList {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    // Time Complexity: O(n + m) where n and m are the lengths of the two linked lists.
    // Space Complexity: O(1) as we are not using any extra space for merging.
    public static ListNode mergeTwoSortedList(ListNode head1, ListNode head2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while (head1 != null && head2 != null) {
            if(head1.val < head2.val) {
                curr.next = head1;
                head1 = head1.next;
            }
            else {
                curr.next = head2;
                head2 = head2.next;
            }
            curr = curr.next;
        }

        if(head1 != null) {
            curr.next = head1;
        }
        else {
            curr.next = head2;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(3);
        head1.next.next = new ListNode(5);

        ListNode head2 = new ListNode(2);
        head2.next = new ListNode(4);
        head2.next.next = new ListNode(6);

        ListNode mergedHead = mergeTwoSortedList(head1, head2);

        // Print merged list
        ListNode curr = mergedHead;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }
}
