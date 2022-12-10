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
    private int sum=0;
    private long maxproduct=0;
    
    public int maxProduct(TreeNode root) {
        findSum(root);
        calculateSubTreeSum(root);
        return (int)(maxproduct%((int)Math.pow(10,9)+7));
    }
    public void findSum(TreeNode root){
        if(root==null){
            return;
        }
        findSum(root.left);
        findSum(root.right);
        sum+=(long)root.val;
    }
    public long calculateSubTreeSum(TreeNode root){
        if(root==null)  return 0;
        long l=calculateSubTreeSum(root.left);
        long r=calculateSubTreeSum(root.right);
        long subtreesum=l+r+root.val;
        maxproduct=(long)Math.max(maxproduct,((subtreesum)*(sum-subtreesum)));
        return subtreesum;
        
    }
    
}