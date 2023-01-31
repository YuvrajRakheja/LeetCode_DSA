//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String A = read.readLine();
            String B = read.readLine();

            Solution ob = new Solution();
            out.println(ob.minRepeats(A,B));
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int minRepeats(String A, String B) {
        // code here
        String original_A=A;
        int moves=1;
        
        while(A.length()<B.length()){
            A+=original_A;
            moves++;
        }
        if(check(A,B)){
            return moves;
        }
        A+=original_A;
        moves++;
        
        if(check(A,B)){
            return moves;
        }
        return -1;
    }
    public static boolean check(String A,String B){
        
        for(int i=0;i<=A.length()-B.length();i++){
            int j;
            for(j=0;j<B.length();j++){
                if(A.charAt(i+j)!=B.charAt(j)){
                    break;
                } 
            }
            if(j==B.length()){
                return true;
            }
        }
        return false;
    }
};