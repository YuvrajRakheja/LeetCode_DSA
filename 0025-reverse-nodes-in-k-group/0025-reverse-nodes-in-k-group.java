//TC-0(2N)--0(N)
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
    static ListNode th=null;
    static ListNode tt=null;
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null||head.next==null||k==1){
            return head;
        }
        ListNode oh=null,ot=null;
        ListNode curr=head;
        int len=length(curr);
        
        while(len>=k){
            int tempk=k;
            while(tempk-->0){
                ListNode forwd=curr.next;//store karo
                curr.next=null;//link break
                addFirst(curr);
                curr=forwd;
            }
            if(oh==null){
                oh=th;
                ot=tt;
            }else{
                ot.next=th;
                ot=tt;
            }
            th=null;
            tt=null;
            len-=k;
        }
        ot.next=curr;
        return oh;
    }
    public int length(ListNode node){
        ListNode curr=node;
        int len=0;
        while(curr!=null){
            curr=curr.next;
            len++;
        }
        return len;
    }
    public void addFirst(ListNode node){
        if(th==null){
            th=node;
            tt=node;
        }else{
            node.next=th;
            th=node;
        }
    }
}