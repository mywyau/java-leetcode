package leetcode.easy.mergeTwoSortedLists;

// You are given the heads of two sorted linked lists list1 and list2.
// Merge the two lists into one sorted linked list, and return the head of the merged list.

// Input: list1 = [1, 2, 4], list2 = [1, 3, 4]
// Output: [1, 1, 2, 3, 4, 4]

public class MergeTwoSortedLists {

    // public means accessible | return type ListNode | method name | parameters

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode(0); // dummy head, initiate head, we accumulate here and use this to create and
                                          // save the output.

        ListNode current = dummy; // current points to the last node in the result list

        while (list1 != null && list2 != null) { // we iterate through out lists of numbers, and for each node do the
                                                 // following:

            if (list1.val < list2.val) { // if node 1 < node 2
                current.next = list1; // then we update our accumulator with our node
                list1 = list1.next; // update list1 to be the next node
            } else {
                current.next = list2; // else we use list2, then we update our accumulator with the node from list 2
                list2 = list2.next; // update list2 to be the next node since we have used the current node
            }

            current = current.next; // move the current pointer forward in the merged list
        }

        // Once we breakout of the loop above
        // Attach the remaining nodes
        // since we run this after the while loop, it’s not possible for both to be non-null at this point.
        
        // This loop continues as long as both lists are not null.

        //  So, it only stops when at least one is null. That means:
        //  Either list1 == null, or
        //  list2 == null, or
        //  Both are null
        if (list1 != null) {
            current.next = list1; // set any remaining nodes in list1
        } else {
            current.next = list2; // If list1 is null and list2 still has nodes, we just attach the rest of list2
                                  // directly, because it's already sorted.
        }

        return dummy.next; // “We return dummy.next at the end to skip the dummy node itself.”
    }

    public static void main(String[] args) {

        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        MergeTwoSortedLists merger = new MergeTwoSortedLists();
        ListNode result = merger.mergeTwoLists(l1, l2);

        while (result != null) {
            System.out.print(result.val + (result.next != null ? " -> " : "\n"));
            result = result.next;
        }
    }
}
