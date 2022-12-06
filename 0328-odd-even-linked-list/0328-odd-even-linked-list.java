//TC-0(N)
//SC-0(1)

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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        
        ListNode dummy0=new ListNode(-1);
        ListNode prev0=dummy0;
        ListNode dummy1=new ListNode(-1);
        ListNode prev1=dummy1;
        int cnt=0;
        
        while(head!=null){
            if(cnt%2==0){
                prev0.next=head;
                prev0=prev0.next;
            }else{
                prev1.next=head;
                prev1=prev1.next;
            }
            head=head.next;
            cnt++;
        }
        prev1.next=null;
        prev0.next=dummy1.next;
        return dummy0.next;
    }
}