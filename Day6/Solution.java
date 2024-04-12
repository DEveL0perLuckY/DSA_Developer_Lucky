/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;

        // Move the fast pointer forward by n nodes
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }
    
        // dummy [0, [1,2,3,4,5] so my fast pointer is at 3 now         
        // Move both fast and slow pointers until fast reaches the end
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        // [0, [1,2,3,5]
        return dummy.next; // Return the head of the modified list
    }
}