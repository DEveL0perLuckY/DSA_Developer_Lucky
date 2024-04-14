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
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode oddHead = new ListNode(0, null);
        ListNode evenHead = new ListNode(0, null);
        int i = 1;
        ListNode odd = oddHead;
        ListNode even = evenHead;

        for (ListNode current = head; current != null; current = current.next, i++) {
            // head [1,2,3,4,5]
            ListNode temp = new ListNode(current.val, null);
            if (i % 2 == 0) {
                even.next = temp;
                even = temp;
            } else {
                odd.next = temp;
                odd = temp;
            }
        }
        // odd [0,1,3,5]
        // even [0,2,4]

        odd.next = evenHead.next;
        return oddHead.next;
    }
}