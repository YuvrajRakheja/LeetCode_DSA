//TC-0(N)
//SC-0(N)
//https://www.youtube.com/watch?v=3OXWEdlIGl4&list=PLgUwDviBIf0q8Hkd7bK2Bpryj2xVJk8Vk&index=20
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new LinkedList<>();
        if(root==null)  return ans;
        
        Queue<TreeNode> q=new LinkedList();
        q.add(root);
        boolean flag=true;
        
        while(!q.isEmpty()){
            int size=q.size();
            LinkedList<Integer> semi_ans=new LinkedList<>();
            
            for(int i=0;i<size;i++){
                if(q.peek().left!=null)  q.offer(q.peek().left);
                if(q.peek().right!=null)    q.offer(q.peek().right);
                
                if(flag==true)  semi_ans.addLast(q.poll().val);
                else{
                    semi_ans.addFirst(q.poll().val);    
                }
            }
            flag=!flag;
            ans.add(semi_ans);
        }
        return ans;
    }
}