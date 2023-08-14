//TC-0(N)
//SC-0(N)
//BRUTE
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
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> arr=new ArrayList<>();
        
        while(head!=null){
            arr.add(head.val);
            head=head.next;
        }
        
        for(int i=0;i<arr.size()/2;i++){
            if(arr.get(i)!=arr.get(arr.size()-1-i)) return false;
        }
        return true;
    }
}