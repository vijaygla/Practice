public class ReverseLinkedList {

    static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static ListNode reverseLinkedList(ListNode head) {
        ListNode prevNode = null;
        ListNode currNode = head;
        ListNode nextNode = null;

        while(currNode != null) {
            nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }

        return prevNode;
    }

    public static void printList(ListNode head) {
        ListNode curr = head;
        while(curr != null) {
            System.out.print(curr.data + "---> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);
        head.next.next.next.next = new ListNode(50);

        System.out.print("Original LinkedList--->       ");
        printList(head);

        System.out.print("Reversed LinkedList--->       ");
        ListNode reversedHead = reverseLinkedList(head);
        printList(reversedHead);
    }
}
