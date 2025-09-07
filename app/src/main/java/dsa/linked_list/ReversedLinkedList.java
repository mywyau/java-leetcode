package dsa.linked_list;

import java.util.HashSet;
import java.util.Set;

public class ReversedLinkedList {

    public ListNode reversedLinkedList(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next; // store next
            curr.next = prev; // store next
            prev = curr; // ✅ move prev forward
            curr = next;
        }

        return prev;
    }

    // Cycle Detection is one of the most common linked list interview questions. It tests how well you handle pointers. Let’s break it down:

    public boolean hasCycleHashSet(ListNode head) {
        Set<ListNode> seen = new HashSet<>();
        while (head != null) {
            if (seen.contains(head))
                return true;
            seen.add(head);
            head = head.next;
        }
        return false;
    }

    // Given a linked list, determine if it has a cycle.

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