//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class Node {
    int data;
    Node left, right;
    
    public Node(int data){
        this.data = data;
        left = right = null;
    }
}

public class Main {
    
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            GFG obj = new GFG();
            Node tree = obj.constructBST(arr);
            preorder(tree);
            System.out.println();
        }
	}
	
	 public static void preorder(Node root){
        if(root == null){
            return;
        }
        
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
}


// } Driver Code Ends


//User function Template for Java

//https://www.youtube.com/watch?v=8w_NSKo9e74&list=PL-Jc9J83PIiHgjQ9wfJ8w-rXU368xNX4L&index=18
class GFG 
{   public static class Pair{
        Node par=null;
        int lr=-(int)1e9;
        int rr=(int)1e9;
        
        Pair(){
            
        }
        Pair(Node par,int lr,int rr){
            this.par=par;
            this.lr=lr;
            this.rr=rr;
        }
    }
    //Function to construct the BST from its given level order traversal.
    public Node constructBST(int[] arr)
    {
        //Write your code here 
        LinkedList<Pair> q=new LinkedList<>();
        q.addLast(new Pair());
        Node root=null;
        int i=0;
        
        while(q.size()!=0 && i<arr.length){
            Pair rp=q.removeFirst();
            int ele=arr[i];
            
            if(ele<rp.lr || ele>rp.rr)  continue;
            Node node=new Node(ele);
            i++;
            
            if(rp.par==null){
                root=node;
            }else{
                Node par=rp.par;
                
                if(ele<par.data){
                    par.left=node;
                }else{
                    par.right=node;
                }
            }
            q.addLast(new Pair(node,rp.lr,ele));
            q.addLast(new Pair(node,ele,rp.rr));
        }
        return root;
    }
}