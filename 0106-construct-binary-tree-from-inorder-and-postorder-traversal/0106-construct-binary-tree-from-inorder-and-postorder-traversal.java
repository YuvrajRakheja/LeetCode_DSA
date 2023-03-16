//redo
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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer,Integer> inorderMap = new HashMap<>();
        
        for(int i=0;i<inorder.length;i++) inorderMap.put(inorder[i],i);
        
        return buildTreeFromPostIn(0,inorder.length-1,postorder,0,postorder.length-1,inorderMap);
}
private TreeNode buildTreeFromPostIn(int inorderStart, int inorderEnd,int[] post, int postStart, int postEnd, Map<Integer,Integer> inorderMap){
        if(inorderStart>inorderEnd || postStart>postEnd) return null;
    
        TreeNode root = new TreeNode(post[postEnd]);
 
        int rootIndex = inorderMap.get(post[postEnd]);
        int leftSubTree= rootIndex-inorderStart;
        
        root.left=buildTreeFromPostIn(inorderStart,rootIndex-1,post,
            postStart,postStart+leftSubTree-1,inorderMap);
    
        root.right=buildTreeFromPostIn(rootIndex+1,inorderEnd,post,
            postStart+leftSubTree,postEnd-1,inorderMap);
        return root;
}

}