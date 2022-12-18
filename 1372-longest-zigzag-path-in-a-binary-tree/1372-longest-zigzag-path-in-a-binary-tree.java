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
    public int longestZigZag(TreeNode root) {
        int[] ans=longestZigZag_(root);
        return ans[2];
    }
    public int[] longestZigZag_(TreeNode node){
        if(node==null)  return new int[]{-1,-1,0};
        
        //index 0 mee we are storing forwardslope "/"
        //index 1 mee we are storing backwardslope "\"
        //index 2 mee we are storing maxlength
        
        int[] lchild=longestZigZag_(node.left);
        int[] rchild=longestZigZag_(node.right);
        
        int[] myans=new int[3];
        myans[0]=lchild[1]+1;//forward
        myans[1]=rchild[0]+1;//backward
        myans[2]=Math.max(Math.max(lchild[2],rchild[2]),Math.max(lchild[1],rchild[0])+1);
        return myans;
    }
}