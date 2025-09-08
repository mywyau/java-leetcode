package dsa.linked_list;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {

    // Given a linked list, determine if it has a cycle.

    // Cycle Detection is one of the most common linked list interview questions. It
    // tests how well you handle pointers. Let’s break it down:

    // ✅ Simple to implement.
    // ❌ Uses O(n) space.

    public boolean LinkedListCycleHashSetHashSet(ListNode head) {
        Set<ListNode> seen = new HashSet<>();
        while (head != null) {
            if (seen.contains(head))
                return true;
            seen.add(head);
            head = head.next;
        }
        return false;
    }

    // Floyd’s Cycle Detection
    // Use two pointers:

    // slow → moves 1 step
    // fast → moves 2 steps

    // If there’s no cycle, fast will hit null.
    // If there is a cycle, eventually fast == slow.

    public boolean hasCycleTwoPointer(ListNode head) {
        if (head == null || head.next == null)
            return false;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // move 1 step
            fast = fast.next.next; // move 2 steps

            if (slow == fast)
                return true; // cycle detected
        }

        return false; // reached end → no cycle
    }

    public ListNode detectCycleStart(ListNode head) {
        if (head == null || head.next == null)
            return null;

        ListNode slow = head;
        ListNode fast = head;

        // Step 1: Detect cycle using Floyd’s algorithm
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                // Step 2: Find cycle start
                ListNode ptr1 = head;
                ListNode ptr2 = slow;
                while (ptr1 != ptr2) {
                    ptr1 = ptr1.next;
                    ptr2 = ptr2.next;
                }
                return ptr1; // or ptr2, same node
            }
        }

        return null; // no cycle
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3)));

        LinkedListCycle linkedListCycle = new LinkedListCycle();

        boolean doesHaveCycle = linkedListCycle.LinkedListCycleHashSetHashSet(head);

        System.out.println("doesHaveCycle: " + doesHaveCycle);


        // we actually need to define nodes in memory to reference since this is just pointing to a new node with value 2
        // e.g. 1 -> 2 -> 3 -> 4 -> 2  - and does not loop back to the second node but a new node

        // ListNode linkedListWithCycle = new ListNode(1,
        // new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(2)))));  
        

        ListNode node4 = new ListNode(4);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        node4.next = node2;

        ListNode linkedListWithCycleHead = node1;

        ListNode detectCycleResult = linkedListCycle.detectCycleStart(linkedListWithCycleHead);

        System.out.println("detectCycleStart: " + detectCycleResult.val);

    }

}