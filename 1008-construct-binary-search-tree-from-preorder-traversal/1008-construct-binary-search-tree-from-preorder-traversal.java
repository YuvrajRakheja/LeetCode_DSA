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
    int idx;
    public TreeNode bstFromPreorder(int[] preorder) {
        if(preorder == null) {
            return null;
        }
        idx=0;
        int lr=-(int)1e9-1;
        int rr=(int)1e9+1;
        return bstpreorder(preorder,lr,rr);
    }
    public TreeNode bstpreorder(int[] preorder,int leftrange,int rightrange){
        if(idx>=preorder.length || preorder[idx]<leftrange || preorder[idx]>rightrange){
            return null;
        }
        
        TreeNode nn=new TreeNode(preorder[idx++]);
        nn.left=bstpreorder(preorder,leftrange,nn.val);
        nn.right=bstpreorder(preorder,nn.val,rightrange);
        
        return nn;
    }
}
