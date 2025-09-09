package dsa.linked_list;

// Input:
// l1 = 2 → 4 → 3   (represents 342)
// l2 = 5 → 6 → 4   (represents 465)

// Output:
// 7 → 0 → 8   (represents 807)

// 342 + 465 = 807

// Time: O(max(m, n)) — process each digit once.
// Space: O(max(m, n)) — result list length.

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {

            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l1 = l2.next;
            }

            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {

        // 342 (2->4->3)
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        // 465 (5->6->4)
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        AddTwoNumbers adder = new AddTwoNumbers();
        ListNode result = adder.addTwoNumbers(l1, l2);

        // Print result
        System.out.print("Result: ");
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
        
        // Output: 7 0 8
    }

}
