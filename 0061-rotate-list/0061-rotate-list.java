//TC-0(COUNT)+0(COUNT-(COUNT%K))
//SC-0(1)
//OPTIMIZED CODE
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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0)   return head;
        
        ListNode temp=head;
        int count=1;
        while(temp.next!=null){
            temp=temp.next;
            count++;
        }
        
        //last node connect to start
        temp.next=head;
        k=k%count;
        
        int end=count-k;
        while(end--!=0) temp=temp.next;
        
        head=temp.next;
        temp.next=null;
        
        return head;
    }
}