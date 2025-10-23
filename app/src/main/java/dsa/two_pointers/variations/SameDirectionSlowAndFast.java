package dsa.two_pointers.variations;

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

        int step = 0;
        while (fast != null && fast.next != null) {
            System.out.printf("Step %d -> slow: %d, fast: %d%n", step, slow.val, fast.val);
            if (slow == fast) {
                System.out.println("Cycle detected!");
                return true;
            }
            slow = slow.next;
            fast = fast.next.next; // fast moves twice as fast
            step++;
        }

        System.out.println("No cycle detected.");
        return false;
    }

    public static void main(String[] args) {
        
        // Example 1: No cycle
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);

        System.out.println("Example 1: No cycle");
        hasCycle(head1);

        System.out.println("\n====================\n");

        // Example 2: Create a cycle (node 4 points back to node 2)
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        head2.next.next.next = new ListNode(4);
        head2.next.next.next.next = head2.next; // create a cycle: 4 → 2

        System.out.println("Example 2: With cycle");
        hasCycle(head2);
    }
}
