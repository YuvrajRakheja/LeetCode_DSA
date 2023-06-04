//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine().trim());
        while(t-- > 0)
        {
            String s;
            s = in.readLine().trim();
            
            Solution ob = new Solution();
            
            out.println(ob.reverseEqn(s));    
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
   
    String reverseEqn(String s)
    {
        // your code here
        int i=s.length()-1;
        StringBuilder ans=new StringBuilder();
        
        while(i>=0){
            int num=0;
            int pow=0,j=i;
            
            while(j>=0 && s.charAt(j)>='0' && s.charAt(j)<='9'){
                num+=(int)(s.charAt(j)-'0')*Math.pow(10,pow);
                pow++;
                j--;
            }
            ans.append(Integer.toString(num));
            
            if(j>=0 && (s.charAt(j)<'0'||s.charAt(j)>'9')){
                ans.append(s.charAt(j));
                j--;
            }
            i=j;
        }
        return ans.toString();
        
    }
}