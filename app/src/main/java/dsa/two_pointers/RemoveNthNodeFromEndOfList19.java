package dsa.two_pointers;


// Given the head of a linked list, remove the n-th node from the end of the list and return its head.
// 
// Example:
// 
// Input: head = [1,2,3,4,5], n = 2
// Output: [1,2,3,5]

// The Challenge

// We want to remove the n-th node from the end of a linked list.
// Naïve approach
// Traverse the list once to count the length → L.
// The node to remove is at position (L - n) from the start.
// Traverse again until (L - n) and remove the node.
// This works, but it needs two passes through the list.

// Why Two Pointers?

// The two-pointer technique lets us do it in one pass:
// If we keep a gap of n nodes between two pointers, then when the fast pointer reaches the end, the slow pointer will be just before the node we want to remove.
// That way, we only traverse the list once.

class ListNode {

    int val;

    ListNode next;
    ListNode(int val) {this.val = val;}
}


public class RemoveNthNodeFromEndOfList19 {

  public ListNode removeNthFromEnd(ListNode head, int n) {
        // Dummy node simplifies edge cases
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;

        // Move fast n+1 steps ahead
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        // Move both until fast reaches end
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Remove nth node
        slow.next = slow.next.next;

        return dummy.next;
    }

}
