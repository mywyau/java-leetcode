package dsa.linked_list;

import java.util.HashSet;
import java.util.Set;

public class HasCycle {

    // Given a linked list, determine if it has a cycle.

    // Cycle Detection is one of the most common linked list interview questions. It
    // tests how well you handle pointers. Let’s break it down:

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

    public static void main(String[] args) {

        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3)));

        HasCycle hasCycle = new HasCycle();

        boolean doesHaveCycle = hasCycle.hasCycleHashSet(head);

        System.out.println("doesHaveCycle: " + doesHaveCycle);
    }

}