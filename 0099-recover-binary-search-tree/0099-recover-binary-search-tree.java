//TC-0(N)
//SC-0(1)
//MORRIS TRAVERSAL
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
    public void recoverTree(TreeNode root) {
        TreeNode curr=root,a=null,b=null,prev=null;
        
        while(curr!=null){
            TreeNode leftnode=curr.left;
            if(leftnode==null){
                if(prev!=null && prev.val>=curr.val){
                    if(a==null){
                        a=prev;
                    }
                    b=curr;
                }
                prev=curr;
                curr=curr.right;
            }else{
                TreeNode right_most=leftnode;
                while(right_most.right!=null && right_most.right!=curr){
                    right_most=right_most.right;
                }
                if(right_most.right==null){
                    right_most.right=curr;
                    curr=curr.left;
                }else{
                    right_most.right=null;
                    if(prev.val>=curr.val){
                        if(a==null){
                            a=prev;
                        }
                        b=curr;
                    }
                    prev=curr;
                    curr=curr.right;
                }
            }
        }
        if(a!=null){
            int temp=a.val;
            a.val=b.val;
            b.val=temp;
        }
    }
}