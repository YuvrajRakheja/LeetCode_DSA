//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String A = br.readLine().trim();
            Solution ob = new Solution();
            String ans = ob.FirstNonRepeating(A);
            out.println(ans);
        }
        out.close();
    }
}

// } Driver Code Ends


class Solution
{
    public String FirstNonRepeating(String A)
    {
        // code here
        int[] freq=new int[26];
        
        Queue<Integer> q=new ArrayDeque<>();
        StringBuilder sb=new StringBuilder();
        
        for(int i=0;i<A.length();i++){
            char ch=A.charAt(i);
            freq[ch-'a']++;
            
            if(freq[ch-'a']==1){
                q.add(ch-'a');
            }
            
            while(q.size()>0 && freq[q.peek()]>1){
                q.remove();
            }
            
            if(q.size()==0){
                sb.append("#");
            }else{
                sb.append((char)(q.peek()+'a'));
            }
        }
        return sb.toString();
    }
}