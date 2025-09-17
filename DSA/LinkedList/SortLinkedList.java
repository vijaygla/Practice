import java.util.*;

public class SortLinkedList {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static ListNode sortList(ListNode head) {
        if(head == null) return null;
        ArrayList<Integer> nums = new ArrayList<>();

        while (head != null) {
            nums.add(head.val);
            head = head.next;
        }
        Collections.sort(nums);

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        
        for(int num : nums) {
            curr.next = new ListNode(num);
            curr = curr.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(0);
        head.next.next.next.next.next.next = new ListNode(-1);
        head.next.next.next.next.next.next.next = new ListNode(8);

        System.out.print("Original List: ");
        printList(head);
        ListNode sortedHead = sortList(head);
        System.out.print("Sorted List:  ");
        printList(sortedHead);
    }
}
