//TC-0(NKLOGN(K))
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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0){
            return null;
        }
        return mergeKLists(0,lists.length-1,lists);
    }
    public ListNode mergeKLists(int si,int li,ListNode[] lists){
        if(si>li)   return null;
        if(si==li)  return lists[si];
        
        int mid=(si+li)/2;
        
        ListNode fsh=mergeKLists(si,mid,lists);
        ListNode ssh=mergeKLists(mid+1,li,lists);
        
        return merge2LL(fsh,ssh);
    }
    public ListNode merge2LL(ListNode l1,ListNode l2){
        if(l1==null || l2==null){
            return l1!=null?l1:l2;
        }
        ListNode dummy=new ListNode(-1);
        ListNode previous=dummy;
        ListNode c1=l1,c2=l2;
        
        while(c1!=null && c2!=null){
            if(c1.val>c2.val){
                previous.next=c2;
                c2=c2.next;
            }else{
                previous.next=c1;
                c1=c1.next;
            }
            previous=previous.next;
        }
        previous.next=(c1!=null)?c1:c2;
        return dummy.next;
    }
}