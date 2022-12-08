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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        
        storeleaves(l1,root1);
        storeleaves(l2,root2);
        
        if(l1.size()!=l2.size()){
            return false;
        }
        for(int i=0;i<l1.size();i++){
            int n1=l1.get(i);
            int n2=l2.get(i);
            if(n1!=n2){
                return false;
            }
        }
        return true;
    }
    public void storeleaves(List<Integer> list,TreeNode root){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            list.add(root.val);
        }
        storeleaves(list,root.left);
        storeleaves(list,root.right);
    }
}