//TC-0(N)
//SC-0(near n)    maximum WIDTH OF TREE
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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        LinkedList<TreeNode> q=new LinkedList<>();
        q.addLast(root);
        
        while(q.size()>0){
            int size=q.size();
            ans.add(q.getFirst().val);
    
            while(size-->0){
                TreeNode nn=q.removeFirst();

                if(nn.right!=null)   q.add(nn.right);
                if(nn.left!=null)    q.add(nn.left);
            }
        }
        return ans;
    }
}