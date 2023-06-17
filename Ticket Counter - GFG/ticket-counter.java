//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            String s[]=in.readLine().trim().split(" ");
            int n=Integer.parseInt(s[0]);
            int k=Integer.parseInt(s[1]);
            Solution ob=new Solution();
            out.println(ob.distributeTicket(n,k));
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    public static int distributeTicket(int N,int k)
    {
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<N;i++)    ans.add(i+1);
        
        while(ans.size()>1){
            for(int i=0;i<k;i++){
                if(ans.size()==1)   return ans.get(0);
                ans.remove(0);
            }
            for(int i=0;i<k;i++){
                if(ans.size()==1)   return ans.get(0);
                ans.remove(ans.size()-1);
            }
        }
        return ans.get(0);
    }
}