// Quick Sort In a Linked List 
// Best Case nlogn,worst case is n2
// space logn
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
        return quicksort_(head)[0];
    }
    public ListNode[] quicksort_(ListNode head){
        if(head==null || head.next==null){
            return new ListNode[]{head,head};
        }
        int len=getLength(head);
        int mid=len/2;
        
        ListNode[] segragatedlist=segragate(head,mid);
        
        ListNode[] leftsortedhalf=quicksort_(segragatedlist[0]);
        ListNode[] rightsortedhalf=quicksort_(segragatedlist[2]);
        
        return mergeTwoSortedList(leftsortedhalf,segragatedlist[1],rightsortedhalf);
    }
    public ListNode[] segragate(ListNode head,int pivotIdx){
        ListNode small=new ListNode(-1);
        ListNode big=new ListNode(-1);
        
        ListNode sm=small,bg=big,curr=head,pivotNode=head;;
        
        while(pivotIdx-->0){
            pivotNode=pivotNode.next;
        }        
        while(curr!=null){
            if(curr!=pivotNode){
                if(curr.val<=pivotNode.val){
                    sm.next=curr;
                    sm=sm.next;
                }else{
                    bg.next=curr;
                    bg=bg.next;
                }
            }
            curr=curr.next;
        }
        sm.next=null;
        bg.next=null;
        pivotNode.next=null;
        
        return new ListNode[]{small.next,pivotNode,big.next};
    }
    public int getLength(ListNode node){
        if(node==null)  return 0;
        int len=0;
        ListNode curr=node;
        while(curr!=null){
            curr=curr.next;
            len++;
        }
        return len;
    }
    public ListNode[] mergeTwoSortedList(ListNode[] leftsorted,ListNode pivot,ListNode[] rightsorted){
        ListNode head=null,tail=null;
        if(leftsorted[0]!=null && rightsorted[0]!=null){
            leftsorted[1].next=pivot;
            pivot.next=rightsorted[0];
            
            head=leftsorted[0];
            tail=rightsorted[1];            
        }else if(leftsorted[0]!=null){
            head=leftsorted[0];
            
            leftsorted[1].next=pivot;
                
            tail=pivot; 
        }else if(rightsorted[0]!=null){
            head=pivot;
            
            pivot.next=rightsorted[0];
                
            tail=rightsorted[1]; 
        }else{
            head=tail=pivot;
        }
        return new ListNode[]{head,tail};
    }
}