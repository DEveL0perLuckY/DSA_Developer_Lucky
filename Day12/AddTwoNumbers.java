class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Variables to hold the sum, carry, and dummy head of result list
        int sum = 0, carry = 0;
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;

        // Loop until both lists are exhausted
        while (l1 != null || l2 != null) {
            // Extract values from current nodes, or 0 if null
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;

            // Calculate sum, add carry from previous iteration
            sum = x + y + carry;
            // Update carry for next iteration
            carry = sum / 10;
            // Create new node with the digit part of sum, add to result list
            current.next = new ListNode(sum % 10);
            // Move current pointer forward
            current = current.next;

            // Move to next nodes in both lists, if not null
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }

        // If there's a carry after processing both lists, add it as a new node
        if (carry > 0) {
            current.next = new ListNode(carry);
        }

        // Return the next node of dummy head which contains the actual result
        return dummyHead.next;
    }
}
