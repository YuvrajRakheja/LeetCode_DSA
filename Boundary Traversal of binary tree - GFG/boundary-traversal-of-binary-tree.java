//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node  
{ 
    int data; 
    Node left, right; 
   
    public Node(int d)  
    { 
        data = d; 
        left = right = null; 
    } 
}

class GFG
{
    static Node buildTree(String str)
    {
        // Corner Case
        if(str.length() == 0 || str.equals('N'))
            return null;
        String[] s = str.split(" ");
        
        Node root = new Node(Integer.parseInt(s[0]));
        Queue <Node> q = new LinkedList<Node>();
        q.add(root);
        
        // Starting from the second element
        int i = 1;
        while(!q.isEmpty() && i < s.length)
        {
              // Get and remove the front of the queue
              Node currNode = q.remove();
        
              // Get the current node's value from the string
              String currVal = s[i];
        
              // If the left child is not null
              if(!currVal.equals("N")) 
              {
        
                  // Create the left child for the current node
                  currNode.left = new Node(Integer.parseInt(currVal));
        
                  // Push it to the queue
                  q.add(currNode.left);
              }
        
              // For the right child
              i++;
              if(i >= s.length)
                  break;
              currVal = s[i];
        
              // If the right child is not null
              if(!currVal.equals("N")) 
              {
        
                  // Create the right child for the current node
                  currNode.right = new Node(Integer.parseInt(currVal));
        
                  // Push it to the queue
                  q.add(currNode.right);
              }
              
              i++;
        }
    
        return root;
    }
    
    public static void main(String args[]) throws IOException {
    
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t>0)
        {
            String s = br.readLine();
            Node root = buildTree(s);
            
            Solution T = new Solution();
            
            ArrayList <Integer> res = T.boundary(root);
            for (Integer num : res) System.out.print (num + " ");
            System.out.println();
            t--;
        }
    }
}

// } Driver Code Ends


//User function Template for Java

// class Node  
// { 
//     int data; 
//     Node left, right; 
   
//     public Node(int d)  
//     { 
//         data = d; 
//         left = right = null; 
//     } 
// }

class Solution
{
	ArrayList <Integer> boundary(Node node)
	{
	 ArrayList<Integer> ans=new ArrayList<>();
	 if(!isLeaf(node))    ans.add(node.data);
	 
	 leftboundary(node,ans);
	 leafnodes(node,ans);
	 rightboundary(node,ans);
	 
	 return ans;
	}
	public static boolean isLeaf(Node node){
	    if(node.left==null && node.right==null) return true;
	    else    return false;
	}
	public static void leftboundary(Node node,ArrayList<Integer> ans){
	    Node curr=node.left;
	    
	    while(curr!=null){
	        if(isLeaf(curr)==false){
	            ans.add(curr.data);
	        }
	        if(curr.left!=null) curr=curr.left;
	        else    curr=curr.right;
	    }
	}
	public static void leafnodes(Node node,ArrayList<Integer> ans){
	    if(isLeaf(node)){
	        ans.add(node.data);
	        return;
	    }
	    if(node.left!=null) leafnodes(node.left,ans);
	    if(node.right!=null) leafnodes(node.right,ans);//inorder me answer nikalte hua
	}
	public static void rightboundary(Node node,ArrayList<Integer> ans){
	    Node cur=node.right;
	    ArrayList<Integer> tempans=new ArrayList<>();
	   
	    while(cur!=null){
	        if(!isLeaf(cur)){
	            tempans.add(cur.data);
	        }   
	        
	        if(cur.right!=null) cur=cur.right;
	        else    cur=cur.left;
	    }
	    for(int i=tempans.size()-1;i>=0;i--){
	        ans.add(tempans.get(i));
	    }
	}
}
