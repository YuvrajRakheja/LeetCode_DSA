//FOR INTERVIEW PURPOSE USE THIS FORMAT OF CLASS 
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
    class Pair{
        int withrobbery=0;
        int withoutrobbery=0;
    }
    public int rob(TreeNode root) {
        Pair ans=rob_(root);
        return Math.max(ans.withrobbery,ans.withoutrobbery);
    }
    public Pair rob_(TreeNode node){
        if(node==null)  return new Pair();
        
        Pair leftchild=rob_(node.left);
        Pair rightchild=rob_(node.right);
        
        Pair myans=new Pair();
        myans.withrobbery=node.val+leftchild.withoutrobbery+rightchild.withoutrobbery;
        myans.withoutrobbery=Math.max(leftchild.withrobbery,leftchild.withoutrobbery)+Math.max(rightchild.withrobbery,rightchild.withoutrobbery);
        
        return myans;
        
    } 
}