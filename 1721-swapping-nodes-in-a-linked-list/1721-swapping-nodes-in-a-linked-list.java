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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode frwd=head,back=head,temp=head;
        
        while(k-->1){
            temp=temp.next;
        }
        
        frwd=temp;
        
        while(temp.next!=null){
            back=back.next;
            temp=temp.next;
        }
        int temp1=back.val;
        back.val=frwd.val;
        frwd.val=temp1;
        
        return head;
    }
}