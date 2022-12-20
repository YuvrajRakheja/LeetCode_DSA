//https://www.youtube.com/watch?v=klXjnz8zn2E&list=PL-Jc9J83PIiHgjQ9wfJ8w-rXU368xNX4L&index=7

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
    public TreeNode prev=null;
    public boolean isValidBST(TreeNode root) {
        if(root==null){
            return true;
        }
        if(!isValidBST(root.left))  return false;
        
        if(prev!=null && prev.val>=root.val)    return false;
        
        prev=root;
        
        if(!isValidBST(root.right)) return false;
        return true;
    }
}