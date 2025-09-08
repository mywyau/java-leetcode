package dsa.linked_list;

// Input: l1 = 1 → 2 → 4
//        l2 = 1 → 3 → 4
// Output: 1 → 1 → 2 → 3 → 4 → 4

// We traverse both lists at the same time:
// Compare l1.val and l2.val.
// Append the smaller one to the result list.
// Move that pointer forward.
// Continue until one list runs out, then attach the rest of the other list.
// 👉 To simplify, we use a dummy head node so we don’t need special cases for the start of the list.

public class MergeTwoSortedLinkedLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(-1); // initiate the dummy
        ListNode tail = dummy; // initiate the tail using the dummy

        while (l1 != null && l2 != null) {

            if (l1.val < l2.val) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next; // move tail
        }

        // Attach any remaining nodes
        if (l1 != null) {
            tail.next = l1;
        } else {
            tail.next = l2;
        }

        return dummy.next; // skip dummy
    }

    public static void main(String[] args) {
        // l1 = 1 → 2 → 4
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        // l2 = 1 → 3 → 4
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        MergeTwoSortedLinkedLists merger = new MergeTwoSortedLinkedLists();
        ListNode merged = merger.mergeTwoLists(l1, l2);

        System.out.print("Merged List: ");
        while (merged != null) {
            System.out.print(merged.val + " ");
            merged = merged.next;
        }
        // Output: 1 1 2 3 4 4
    }
}
