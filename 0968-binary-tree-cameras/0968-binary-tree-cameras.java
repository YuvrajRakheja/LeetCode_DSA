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
    public int camera=0;
    public int minCameraCover(TreeNode root) {
        if(minCameraCover_(root)==-1)   camera++;
        return camera;
    }
    public int minCameraCover_(TreeNode node){
        // -1-->camera required
        //  0-->camera on me
        //  1-->covered and no need       
        
        if(node==null)  return 1;//iss ki wajah se leaf node -1 return karenge jisse leaf ke parents handle kr lenge
        
        int leftchild=minCameraCover_(node.left);
        int rightchild=minCameraCover_(node.right);
        
        if(leftchild==-1 || rightchild==-1){//left ya right child ko jarurat hai toh parent pe camera lagao
            camera++;
            return 0;
        }
        if(leftchild==0 || rightchild==0){//if left ya right child pe camera toh not required on parent
            return 1;
        }
        return -1;//if left and right child pe  camera nhi hai and  nor required on them(left and right child) toh -1 ki hame need hai
        
        
    }
}