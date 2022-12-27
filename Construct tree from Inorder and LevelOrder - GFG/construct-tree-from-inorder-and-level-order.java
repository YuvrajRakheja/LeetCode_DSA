//{ Driver Code Starts
import java.util.*;

class Node
{
    int data;
    Node left, right;
    
    Node(int item)
    {
        data = item;
        left = right = null;
    }    
        public void setLeft(Node left) 
    {
        this.left = left;
    }
  
    public void setRight(Node right) 
    {
        this.right = right;
    }
        
    
}


class ConstructBT
{
    Node root;
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    
	    while(t-- > 0)
	    {
	        int n = sc.nextInt();
	        
	        int inord[] = new int[n];
	        int level[] = new int[n];
	        for(int i = 0; i < n; i++)
	            inord[i] = sc.nextInt();
	            
	        for(int i = 0; i < n; i++)
	             level[i] = sc.nextInt();
	             
	        GfG g = new GfG();
	        Node node =  g.buildTree(inord, level);
	        printPreOrder(node);
	        System.out.println();
	        
	        
	    }
    }
    
   static void printPreOrder(Node node)
   {
       if(node == null)
          return;
          
        System.out.print(node.data + " ");
        printPreOrder(node.left);
        printPreOrder(node.right);
   }
}

// } Driver Code Ends


/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*Complete the function below*/
class GfG
{
    Node buildTree(int inord[], int level[])
    {
        //your code here
        return buildtree(0,inord.length-1,inord,level);
    }
    Node buildtree(int isi,int iei,int[] inorder,int[] levelorder){
        if(isi>iei){
            return null;
        }
        Node root=new Node(levelorder[0]);
        if(levelorder.length==1)    return root;
        
        int idx=0;
        while(levelorder[0]!=inorder[idx]){
            idx++;
        }
        HashSet<Integer> set=new HashSet<>();
        for(int i=isi;i<idx;i++){
            set.add(inorder[i]);
        }
        int[] loflst=new int[idx-isi];//level order of left subtree
        int[] lorst=new int[iei-idx];//level order of right subtree
        int li=0,ri=0;
        
        for(int i=1;i<levelorder.length;i++){
            int ele=levelorder[i];
            if(set.size()!=0 && set.contains(ele)){
                loflst[li++]=ele;
                set.remove(ele);
            }else{
                lorst[ri++]=ele;
            }
        }
        root.left=buildtree(isi,idx-1,inorder,loflst);
        root.right=buildtree(idx+1,iei,inorder,lorst);
        
        return root;
    }
   
}


