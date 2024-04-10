/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;

        // Move pointers until they meet or fast reaches end of list
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // Detect cycle
            if (slow == fast){   
                break;
            }
        }

        // No cycle detected
        if (fast == null || fast.next == null){
            return null;
        }

        // Reset one pointer to head and move both until they meet
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        // Return the node where the cycle starts
        return slow;
    }
}