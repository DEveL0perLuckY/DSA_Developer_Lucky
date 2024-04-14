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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = null;
        ListNode tail = dummy;
        // head [1,2,6,3,4,5,6]
        for (ListNode current = head; current != null; current = current.next) {
            if (current.val != val) {
                // dummy [0, [1,2,3,4,5]]

                ListNode temp = new ListNode(current.val);
                temp.next = null;
                tail.next = temp;
                tail = temp;

                // temp.next=demo;
                // demo=temp;
            }
        }
        return dummy.next;
    }
}