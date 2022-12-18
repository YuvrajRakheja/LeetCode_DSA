//for interview use class format
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
    public class Pair{
        int forwardslope=-1;//   /->forward    taken -1 as we are counting nodes
        int backwardslope=-1;//  \->backward
        int maxlength=0;
    }
    public int longestZigZag(TreeNode root) {
        Pair ans=longestZigZag_(root);
        return ans.maxlength;
    }
    public Pair longestZigZag_(TreeNode node){
        if(node==null)  return new Pair();
        
        Pair lchild=longestZigZag_(node.left);
        Pair rchild=longestZigZag_(node.right);
        
        Pair myans=new Pair();
        myans.maxlength=Math.max(Math.max(lchild.maxlength,rchild.maxlength),Math.max(lchild.backwardslope,rchild.forwardslope)+1);
        myans.forwardslope=lchild.backwardslope+1;
        myans.backwardslope=rchild.forwardslope+1;
        
        return myans;
    }
}