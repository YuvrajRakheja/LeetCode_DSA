//TC-0(KNLOG(N))
//SC-0(K) MAX IN PQ

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
        PriorityQueue<ListNode> pq=new PriorityQueue<>((a,b)->{
                                        return a.val-b.val;});//this-other for default behaviour
                                    //return b.val-a.val;})//other-this for reverse of default behaviour
        
        for(ListNode l:lists){
            if(l!=null){
                pq.add(l);
            }
        }
        
        ListNode dummy=new ListNode(-1);
        ListNode prev=dummy;
        
        while(pq.size()>0){
            ListNode nn=pq.remove();//remove
            
            prev.next=nn;
            prev=prev.next;
            nn=nn.next;//update
            
            if(nn!=null){
                pq.add(nn);
            }
        }
        return dummy.next;
    }
}