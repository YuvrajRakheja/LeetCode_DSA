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
    public ListNode partition(ListNode head, int x) {
        ListNode smaller=new ListNode(-1);
        ListNode sm=smaller;
        ListNode bigger=new ListNode(-1);
        ListNode big=bigger;
        
        ListNode curr=head;
        
        while(curr!=null){
            if(curr.val<x){
                sm.next=curr;
                sm=sm.next;
            }else{
                big.next=curr;
                big=big.next;
            }
            curr=curr.next;
        }
        sm.next=bigger.next;
        big.next=null;
        return smaller.next;
    }
}