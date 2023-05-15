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
        ListNode frwd=head,back=head;
        int count=1;
        
        while(back.next!=null){
            count++;
            back=back.next;
        }
        back=head;
        count=count-k;
        while(count-->0){
            back=back.next;
        }
            
        while(k-->1){
            frwd=frwd.next;
        }
        int temp=back.val;
        back.val=frwd.val;
        frwd.val=temp;
        
        return head;
    }
}