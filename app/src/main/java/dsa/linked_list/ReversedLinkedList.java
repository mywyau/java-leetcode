package dsa.linked_list;

public class ReversedLinkedList {

    private static String nodeVal(ListNode n) {
        return n == null ? "null" : String.valueOf(n.val);
    }

    private static void printList(String label, ListNode head) {
        System.out.print(label);
        if (head == null) {
            System.out.println("null");
            return;
        }
        for (ListNode p = head; p != null; p = p.next) {
            System.out.print(p.val);
            if (p.next != null)
                System.out.print(" -> ");
        }
        System.out.println();
    }

    // Recursive can fail for very long lists (e.g., 10^5 nodes) because of deep
    // recursion.
    // Iterative has no such risk.

    // Winner: Iterative for large inputs.

    public ListNode reversedLinkedList(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;

        int step = 0;

        while (curr != null) {
            // Save the next node, because we’re about to overwrite curr.next

            ListNode next = curr.next;

            // System.out.printf("BEFORE -> prev=%s, curr=%s, next=%s%n", nodeVal(prev),
            // nodeVal(curr), nodeVal(next));

            curr.next = prev;
            prev = curr;
            curr = next;

            // System.out.printf("AFTER -> prev=%s, curr=%s%n \n", nodeVal(prev),
            // nodeVal(curr));

            // print snapshot of both chains
            System.out.printf("Step %d:%n", ++step);
            printList("  built:     ", prev); // reversed portion
            printList("  remaining: ", curr); // not-yet-processed portion
            System.out.println();

        }

        return prev;
    }

    // Each recursive call adds a frame to the call stack → O(n) extra space in the
    // worst case.

    public static ListNode reverseRecursive(ListNode head) {
        if (head == null || head.next == null) {
            return head; // base case: empty or single node list
        }

        ListNode newHead = reverseRecursive(head.next);
        head.next.next = head; // put head after its next
        head.next = null; // old head becomes tail; terminate
        return newHead;
    }

    public static void main(String[] args) {
        // Original list: 1 -> 2 -> 3 -> null
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));

        ReversedLinkedList reversedLinkedList = new ReversedLinkedList();

        // Reverse the list
        ListNode reversed = reversedLinkedList.reversedLinkedList(head);

        System.out.println("Reversed: ");

        // Print the reversed list: expected output 5 -> 4 -> 3 -> 2 -> 1
        while (reversed != null) {
            System.out.print(reversed.val + " ");
            reversed = reversed.next;
        }
    }
}
