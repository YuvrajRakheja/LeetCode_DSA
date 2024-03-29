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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        ListNode node = new ListNode();
        int sum = 0;
        int carry = 0;
        while(l1!=null){
            st1.push(l1.val);
            l1=l1.next;
        }
        while(l2!=null){
            st2.push(l2.val);
            l2=l2.next;
        }
        while(!st1.empty() || !st2.empty()){
            if(!st1.empty()) sum+=st1.pop();
            if(!st2.empty()) sum+=st2.pop();
            node.val = sum%10;
            carry = sum/10;
            ListNode temp = new ListNode(carry);
            sum = carry;
            temp.next = node;
            node = temp;
            
        }
        return carry==0? node.next:node;
    }
}