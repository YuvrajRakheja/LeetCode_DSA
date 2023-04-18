//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            String input_line[] = read.readLine().trim().split("\\s+");
            int N = Integer.parseInt(input_line[0]);
            int X = Integer.parseInt(input_line[1]);
            String S = read.readLine().trim();
            Solution ob = new Solution();
            boolean ans = ob.wifiRange(N, S, X); 
            if(ans)
            System.out.println(1);
            else
            System.out.println(0);
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    boolean wifiRange(int N, String s, int X) 
    { 
        // code here
        int[] freq=new int[N+1];//+1 so that array out of bounds na ho jaye
        
        for(int i=0;i<N;i++){
            char ch=s.charAt(i);
            if(ch=='1'){
                int leftrange=Math.max(i-X,0);//using max to prevent -ve index which might arise due to condition of i-X
                freq[leftrange]++;
                
                int rightrange=Math.min(i+X,N-1);//mark at i+X as -- to nullify the effect of +1
                freq[rightrange+1]--;
            }
        }
        for(int i=0;i<N;i++){
            if(i>0) freq[i]+=freq[i-1];
            if(freq[i]==0){
                return false;// not under wifi coverage area
            }
        }
        return true;
    }
} 