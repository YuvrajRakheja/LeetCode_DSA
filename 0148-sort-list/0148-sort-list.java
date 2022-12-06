//TC-0(NLOGN)
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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode mid=middle(head);
        ListNode nhead=mid.next;
        mid.next=null;
        
        ListNode fsh=sortList(head);
        ListNode ssh=sortList(nhead);
        
        return merge2LL(fsh,ssh);
    }
    public ListNode middle(ListNode node){
        if(node==null || node.next==null){
            return node;
        }
        ListNode slow=node,fast=node;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode merge2LL(ListNode l1,ListNode l2){
        if(l1==null || l2==null){
            return l1!=null?l1:l2;
        }
        ListNode dummy=new ListNode(-1);
        ListNode previous=dummy;
        
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                previous.next=l1;
                l1=l1.next;
            }else{
                previous.next=l2;
                l2=l2.next;
            }
            previous=previous.next;
        }
        previous.next=(l1!=null)?l1:l2;
        return dummy.next;
    }
}