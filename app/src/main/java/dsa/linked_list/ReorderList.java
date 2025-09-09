package dsa.linked_list;

public class ReorderList {

    // Input: 1 → 2 → 3 → 4 → 5
    // Output: 1 → 5 → 2 → 4 → 3

    // We need to interleave nodes from the start and end.
    // The list is singly linked, so we can’t traverse backward easily.
    // The solution should be in-place (O(1) extra space).

    // Find the middle of the list (using slow/fast pointers).
    // Reverse the second half of the list.
    // Merge the two halves alternately.

    public static void reorderList(ListNode head) {
        if (head == null || head.next == null)
            return;

        // 1. Find middle
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 2. Reverse second half
        ListNode second = reverse(slow.next);
        slow.next = null; // cut the list

        // 3. Merge two halves
        ListNode first = head;
        while (second != null) {
            ListNode tmp1 = first.next;
            ListNode tmp2 = second.next;

            first.next = second;
            second.next = tmp1;

            first = tmp1;
            second = tmp2;
        }
    }

    private static ListNode reverse(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    // Helper to print list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null)
                System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5)))));

        System.out.print("Original: ");
        printList(head);

        reorderList(head);

        System.out.print("Reordered: ");
        printList(head); // Expected: 1 -> 5 -> 2 -> 4 -> 3
    }
}
