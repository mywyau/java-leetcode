package dsa.linked_list;

public class RemoveNthFromEnd {

    /** One-pass two-pointer solution.
     *  Assumes 1 <= n <= length. If you want validation, see the variant below.
     *  Time: O(n), Space: O(1)
     */
    
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode fast = dummy, slow = dummy;

        // 1) Advance fast by n + 1 steps so the gap is n
        for (int i = 0; i < n + 1; i++) {
            fast = fast.next;
        }

        // 2) Move both until fast falls off the list
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // 3) Delete the node after slow
        slow.next = slow.next.next;

        // 4) New head (covers removing the original head)
        return dummy.next;
    }

    // ---------- Helpers for printing / building ----------
    public static void printList(String label, ListNode head) {
        System.out.print(label);
        if (head == null) { System.out.println("null"); return; }
        for (ListNode p = head; p != null; p = p.next) {
            System.out.print(p.val);
            if (p.next != null) System.out.print(" -> ");
        }
        System.out.println();
    }

    public static ListNode fromArray(int... a) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        for (int v : a) {
            tail.next = new ListNode(v);
            tail = tail.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode head = fromArray(1, 2, 3, 4, 5);
        printList("Original: ", head);

        head = removeNthFromEnd(head, 2); // remove the 2nd from end (node 4)
        printList("After removing 2nd from end: ", head); // 1 -> 2 -> 3 -> 5
    }
}
