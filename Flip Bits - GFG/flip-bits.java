//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.maxOnes(a, n));
            
        }
	}
}
// } Driver Code Ends


//User function Template for Java


class Solution {

    public static int maxOnes(int a[], int n) {
        // Your code goes here
        int cnt=0;
        
        for(int i=0;i<a.length;i++){
            if(a[i]==1) cnt++;
            if(a[i]==0){
                a[i]=1;
            }else{
                a[i]=-1;
            }
        }
        int maxi=0,mx=0;
        
        for(int i=0;i<a.length;i++){
            maxi+=a[i];
            mx=Math.max(mx,maxi);
            if(maxi<0){
                maxi=0;
            }
            
        }
        mx=Math.max(mx,0);
        
        return mx+cnt;
    }
}
