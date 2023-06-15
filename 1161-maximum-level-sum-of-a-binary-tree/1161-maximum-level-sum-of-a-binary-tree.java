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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        int maxSum = Integer.MIN_VALUE;;
        int level = 0, ans = 0;

        while (!q.isEmpty()) {
            level++;
            int levelSum = 0;
            int size = q.size();
            while (size-- > 0) {
                TreeNode curr = q.poll();
                levelSum += curr.val;
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
            if (levelSum > maxSum) {
                maxSum = levelSum;
                ans = level;
            }
        }
        return ans;
    }

}