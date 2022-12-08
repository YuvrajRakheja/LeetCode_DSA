//TC-0(N)
//SC-0(1)
//OPTIMIZED
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }
        ListNode curr=head;
        ListNode slow=head,fast=head,entry=head;
        
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            
            if(slow==fast){
                while(entry!=slow){
                    entry=entry.next;
                    slow=slow.next;
                }
                return slow;//return entry as both r same;
            }
        }
        return null;
    }
}