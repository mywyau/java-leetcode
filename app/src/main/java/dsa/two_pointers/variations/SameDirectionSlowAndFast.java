package dsa.two_pointers.variations;

import java.util.Arrays;

// Used when:
// You’re working with linked lists or arrays
// You need to detect cycles, find midpoints, or remove duplicates

class ListNode {

    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class SameDirectionSlowAndFast {

    public static boolean hasCycle(ListNode head) {
        if (head == null)
            return false;

        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            if (slow == fast)
                return true; // cycle detected
            slow = slow.next;
            fast = fast.next.next; // fast moves twice as fast
        }

        return false;
    }

    public static void main(String[] args) {

        int[] nums = { 2, 7, 11, 15 };
        int target = 9;

        // boolean result = hasCycle(nums, target);
        // System.out.println("Indices: " + result);
    }

}
