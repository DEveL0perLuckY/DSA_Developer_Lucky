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
    public ListNode reverseList(ListNode head) {
        if(head==null){
        return null;
        }
        ListNode temp = new ListNode(head.val);
        temp.next=null;
        
        //head = [1,2,3,4,5]
        //temp = [5,4,3,2,1]
        
        for(ListNode current=head.next;current!=null;current=current.next){
            ListNode demo= new ListNode(current.val);
            demo.next=temp;
            temp=demo;
        }
        return temp;
    }
}