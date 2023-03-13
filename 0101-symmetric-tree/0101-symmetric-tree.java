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
    public boolean isSymmetric(TreeNode root) {
        return root==null || isSym(root.left,root.right);
    }
    public boolean isSym(TreeNode l1,TreeNode l2){
        if(l1==null || l2==null)    return l1==l2;
        
        if(l1.val!=l2.val){
            return false;
        }
        return isSym(l1.left,l2.right) && isSym(l1.right,l2.left);
    }
}