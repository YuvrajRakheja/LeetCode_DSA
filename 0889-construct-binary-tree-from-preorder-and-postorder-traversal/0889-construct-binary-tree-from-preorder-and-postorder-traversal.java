//TC-0(n^2)
//SC-0(1)

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
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        return constructFromPrePost(0,preorder.length-1,preorder,0,postorder.length-1,postorder);
    }
    public TreeNode constructFromPrePost(int psi,int pei,int[] preorder,int ppsi,int ppei,int[] postorder){
        if(psi>pei) return null;
        
        TreeNode root=new TreeNode(preorder[psi]);
        if(psi==pei)    return root;
        
        int idx=ppsi;
        while(preorder[psi+1]!=postorder[idx]){
            idx++;
        }
        int cnel=idx-ppsi+1;//count number of elements
        
        root.left=constructFromPrePost(psi+1,psi+cnel,preorder,ppsi,idx,postorder);
        root.right=constructFromPrePost(psi+cnel+1,pei,preorder,idx+1,ppei-1,postorder);
        
        return root;
    }
}