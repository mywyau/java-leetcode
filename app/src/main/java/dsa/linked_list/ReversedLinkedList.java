package dsa.linked_list;

public class ReversedLinkedList {

    public ListNode reversedLinkedList(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next; // store next
            curr.next = prev; // current.next set to previous
            prev = curr; // ✅ move prev forward
            curr = next;
        }

        return prev;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3)));

        ReversedLinkedList reversedLinkedList = new ReversedLinkedList();

        ListNode reversed = reversedLinkedList.reversedLinkedList(head);

        System.out.println("Reversed: ");

        while (reversed != null) {
            System.out.print(reversed.val + " ");
            reversed = reversed.next;
        }

    }

}