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
        ListNode small=new ListNode(0),larg=new ListNode(0);
        ListNode temp1=small,temp2=larg;
        
        while(head!=null){
            if(head.val<x){
                small.next=head;
                small=small.next;
            }else{
                larg.next=head;
                larg=larg.next;
            }
            head=head.next;
        }
        larg.next=null;
        small.next=temp2.next;
        
        return temp1.next;
    }
}