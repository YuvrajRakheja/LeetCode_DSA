//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            String s = read.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.minOperation(s);
            out.println(ans);
        }
        out.close();
    }
}

// } Driver Code Ends


// User function Template for Java
//https://www.youtube.com/watch?v=YqmcqH5_g58
class Solution {
    int minOperation(String s) {
        
        for(int i=s.length()/2-1;i>=0;i--){//checking from maximum possible length of half for equal like abcdabcd 
            if(s.substring(0,i+1).equals(s.substring(i+1,2*i+2))){//cheking halfs
                return (i+1)+1+s.length()-2*(i+1);//add i+1 means half length which is equal and 1 for that half equal ehich will be directly appended and since the remaining is different so add size-2*(common)
            }
        }
        return s.length();//all different
    }
}