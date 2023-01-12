//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;


// } Driver Code Ends
//User function Template for Java
//TC-0(NLOGN+N)=NLOGN
//SC-0(1)
class Solution {
    long minimizeSum(int N, int arr[]) {
        // code here
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int vl:arr){
            pq.offer(vl);
        }
        
        long sum=0;
        
        while(pq.size()>=2){
            int v1=pq.poll();
            int v2=pq.poll();
            
            int final_val=v1+v2;
            sum+=final_val;
            pq.offer(final_val);
        }
        return sum;
    }
}

//{ Driver Code Starts.

public class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n = sc.nextInt();
            int A[] = new int[n];
            
            for (int i = 0; i < n;i++)
            {
                A[i] = sc.nextInt();
            }
            Solution obj = new Solution();
            long ans = obj.minimizeSum(n, A);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends