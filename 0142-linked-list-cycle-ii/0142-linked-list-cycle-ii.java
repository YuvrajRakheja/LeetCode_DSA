//TC-0(N)
//SC-0(N)
//BRUTE FORCE

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
        HashSet<ListNode> st=new HashSet<>();
        ListNode temp=head;
        while(temp!=null){
            if(st.contains(temp)){
                return temp;
            }
            st.add(temp);
            temp=temp.next;
        }
        return null;
    }
}