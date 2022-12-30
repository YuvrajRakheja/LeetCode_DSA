//TC-0(N)
//SC-0(N)AS WE ARE STORING IN STRINGBUILDER
//https://www.youtube.com/watch?v=T2-dVDWLQtE&list=PL-Jc9J83PIiHgjQ9wfJ8w-rXU368xNX4L&index=20
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    public void serialize(TreeNode node,StringBuilder sb){
        if(node==null){
            sb.append("null,");
            return;
        }
        sb.append(node.val+",");
        serialize(node.left,sb);
        serialize(node.right,sb);
    }
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb=new StringBuilder();
        serialize(root,sb);
        return sb.toString();
        
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] arr=data.split(",");
        return deserialize(arr);
    }
    public int idx=0;
    public TreeNode deserialize(String[] data){
        if(idx>=data.length || data[idx].equals("null")){
            idx++;
            return null;
        }
        TreeNode node=new TreeNode(Integer.parseInt(data[idx++]));
        node.left=deserialize(data);
        node.right=deserialize(data);                                   
        
        return node;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));