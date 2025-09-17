public class RemoveKthNodeFromEnd {

    static class  ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static void printList(ListNode head) {
        ListNode curr = head;

        while(curr != null) {
            System.out.print(curr.val);
            if(curr.next != null) System.out.print(" ---> ");
            curr = curr.next;
        }
    }

    public static ListNode removeKthNodeFromEnd(ListNode head, int k) {
        int length = 0;
        ListNode curr = head;

        while (curr != null) {
            length++;
            curr = curr.next;
        }

        int position = length - k;

        if (position == 0) { // delete the first node it means
            return head.next;
        }

        curr = head;
        for(int i=1; i<position; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;

        return head;
    }
    
    public static void main(String[] args) {
        // Input: [1,2,3,4,5], n = 2
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.print("Original List: ");
        printList(head);
        System.out.println();
        int k = 2;
        head = removeKthNodeFromEnd(head, k);

        System.out.print("Modified List: ");
        printList(head); // Output: [1,2,3,5]
    }
}
