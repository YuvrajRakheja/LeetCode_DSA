//FO THIS IN OA'S ONLY
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
    public int rob(TreeNode root) {
        int[] ans=rob_(root);
        return Math.max(ans[0],ans[1]);
    }
    public int[] rob_(TreeNode node){
        if(node==null)  return new int[2];
        
        int[] lchild=rob_(node.left);
        int[] rchild=rob_(node.right);
        
        int[] myans=new int[2];
        myans[0]=node.val+lchild[1]+rchild[1];//doing robbery
        myans[1]=Math.max(lchild[0],lchild[1])+Math.max(rchild[0],rchild[1]);//without robbery
        
        return myans;
    }
}