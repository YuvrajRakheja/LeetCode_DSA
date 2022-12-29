//{ Driver Code Starts
//Initial Template for Java

import java.util.Scanner;
import java.lang.Math;
import java.io.*;
class Node{
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}
class GFG2
{
    public static void inorder(Node root)
    {
        if(root==null)
        return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int []post=new int[n];
            for(int i=0;i<n;i++)
            {
                int b=sc.nextInt();
                post[i]=b;
            }
            GFG obj=new GFG();
            Node root=obj.constructTree(post,n);
            inorder(root);
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java
/*class Node{
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}*/

// Function should return the root of the bst formed using postorder traversal.
class GFG
{   public static int idx=0;
    public static Node constructTree(int post[],int n)
    {
        //Add your code here.
        idx=post.length-1;
        int lr=-(int)1e9-1;
        int rr=(int)1e9+1;
        return constructTree(lr,rr,post);
    }

    public static Node constructTree(int lr,int rr,int[] postorder){
        if(idx<0||postorder[idx]<lr || postorder[idx]>rr)  return null;
        
        Node nn=new Node(postorder[idx--]);
        
        nn.right=constructTree(nn.data,rr,postorder);
        nn.left=constructTree(lr,nn.data,postorder);
        
        return nn;
    }
}