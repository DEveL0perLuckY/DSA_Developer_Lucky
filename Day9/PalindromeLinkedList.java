/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode dummy = new ListNode(head.val, null);
        int i = 0;
        for (ListNode current = head.next; current != null; current = current.next, i++) {
            ListNode temp = new ListNode(current.val);
            temp.next = dummy;
            dummy = temp;
        }
        ListNode x = head;
        ListNode y = dummy;
        for (int j = 0; j <= i / 2; j++) {
            if (x.val != y.val) {
                return false;
            }
            x = x.next;
            y = y.next;
        }
        return true;
    }
}