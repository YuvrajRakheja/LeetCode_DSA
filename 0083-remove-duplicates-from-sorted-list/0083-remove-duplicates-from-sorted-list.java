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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode dummy=new ListNode(-(int)1e8);//aisa nos jo na ho
        ListNode itr=dummy,curr=head;
        
        while(curr!=null){
            while(curr!=null && curr.val==itr.val){
                curr=curr.next;
            }
            itr.next=curr;
            itr=itr.next;
            if(curr!=null)  curr=curr.next;
        }
        return dummy.next;
    }
}