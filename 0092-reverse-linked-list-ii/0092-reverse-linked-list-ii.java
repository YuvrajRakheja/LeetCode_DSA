//TC-0(N)
//SC-0(1)
//DO DRY RUN TO GET BETTER UNDERSTANDING
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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy=new ListNode(-1);
        
        ListNode curr1=dummy;
        ListNode prev1=null;
        curr1.next=head;
        
        for(int i=0;i<left;i++){
            prev1=curr1;
            curr1=curr1.next;
        }
        
        ListNode prev2=prev1;
        ListNode curr2=curr1;
        ListNode frwd;
        
        for(int i=left;i<=right;i++){
            frwd=curr2.next;//save
            
            curr2.next=prev2;//linking
            
            prev2=curr2;
            curr2=frwd;//updating
        }
        
        prev1.next=prev2;
        curr1.next=curr2;//setting up links
        
        return dummy.next;
    }
}