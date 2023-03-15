//TC-0(N)
//SC-0(N)
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
    public boolean isCompleteTree(TreeNode root) {
        boolean check=false;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            TreeNode curr=q.remove();
            if(curr==null)  check=true;//matlab ab null aa gya hai ab koi curr me int aya toh seedha false else last me check krke true
            else{
                if(check==true) return false;
                q.add(curr.left);
                q.add(curr.right);
            }
        }
        return true;//all set hai 
    }
}