//TC-0(N)
//SC-0(1)
//OPTIMIZED
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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null){
            return;
        }
        ListNode middle=mid(head);
        ListNode secondlist=middle.next;//SECOND LIST
        middle.next=null;
        
        secondlist=reverse(secondlist);
        
        ListNode c1=head;
        ListNode c2=secondlist;
        ListNode f1=null;
        ListNode f2=null;
        
        while(c2!=null){//DO DRY RUN FOR EVEN AND ODD U WILL FIND EITHER C1,C2 BECOMES NULL SIMULTANEOUSLY OR C2 BECOMES NULL SO WRITE C2 ONLY
            f1=c1.next;
            f2=c2.next;//STORE
            
            c1.next=c2;
            c2.next=f1;//LINKING
            
            c1=f1;
            c2=f2;//UPDATE
        }
        
        
    }
    public ListNode mid(ListNode node){
        if(node==null || node.next==null){
            return node;
        }
        ListNode slow=node;
        ListNode fast=node;
        
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode node){
        if(node==null || node.next==null){
            return node;
        }
        ListNode curr=node;
        ListNode prev=null;
        ListNode frwd=null;
        
        while(curr!=null){
            frwd=curr.next;
            
            curr.next=prev;
            
            prev=curr;
            curr=frwd;
        }
        return prev;
    }
}