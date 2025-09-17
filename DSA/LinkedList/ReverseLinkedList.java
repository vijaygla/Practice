import java.util.Stack;

public class ReverseLinkedList {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    // brute force
    public static ListNode reverseLL(ListNode head) {
        Stack<Integer> st = new Stack<>();

        while (head != null) {
            st.push(head.val);
            head = head.next;
        }

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while (!st.isEmpty()) {
            curr.next = new ListNode(st.pop());
            curr = curr.next;
        }
        return dummy.next;
    }

    // optimise
    public static ListNode reverse(ListNode head) {
        ListNode prevNode = null;
        ListNode currNode = head;

        while (currNode != null) {
            ListNode nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        return prevNode;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.err.print("Original Linked List: ");
        printList(head);

        System.out.print("Reversed LinkedList using stack: ");
        ListNode reversedHead = reverseLL(head);
        printList(reversedHead);

        System.err.print("Reversed LinkedList using pointer: ");
        ListNode reversedHead2 = reverse(head);
        printList(reversedHead2);
    }
}
