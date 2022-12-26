//using morris traversal
//Tc-0(n)
//sc-0(1)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        TreeNode curr=root,prev=null;
        
        while(curr!=null){
            if(curr.left==null){
                if(prev!=null && prev.val>=curr.val){
                    return false;
                }
                prev=curr;
                curr=curr.right;
            }else{
                TreeNode rightmost=curr.left;
                while(rightmost.right!=null && rightmost.right!=curr){
                    rightmost=rightmost.right;
                }
                if(rightmost.right==null){//form links
                    rightmost.right=curr;
                    curr=curr.left;
                }else{
                    rightmost.right=null;
                    if(prev.val>=curr.val){
                        return false;
                    }
                    prev=curr;
                    curr=curr.right;
                }
            }
        }
        return true;
    }
}