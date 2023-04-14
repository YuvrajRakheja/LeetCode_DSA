//{ Driver Code Starts
import java.util.*;
import java.io.*;

class GFG
 {
	public static void main (String[] args)
	 {
	  
	  //taking input using Scanner class
	  Scanner sc = new Scanner(System.in);
	  
	  //taking count of testcases
	  int t = sc.nextInt();
	  while(t-- > 0){
	      
	      //taking count of houses
	      int n = sc.nextInt();
	      int arr[] = new int[n];
	      
	      //inserting money present in 
	      //each house in the array
	      for(int i = 0; i<n; ++i)
	           arr[i] = sc.nextInt();
  	      
  	      //calling method FindMaxSum() of class solve
  	      System.out.println(new Solution().FindMaxSum(arr, n));
	 }
   }
}
// } Driver Code Ends

//TC-0(N+N)
//SC-0(N)
//Memoization
class Solution
{
    //Function to find the maximum money the thief can get.
    public int FindMaxSum(int arr[], int n)
    {
        // Your code here
        int[] dp=new int[n];
        for(int i=0;i<n;i++){
            dp[i]=-1;
        }
        int ans=helper(arr,n-1,dp);
        return ans;
    }
    public int helper(int[] arr,int idx,int[] dp){
        if(idx==0){
            return arr[idx];
        }
        if(idx<0){
            return 0;
        }
        if(dp[idx]!=-1){
            return dp[idx];
        }
        int notpick=helper(arr,idx-1,dp)+0;
        
        int pick=helper(arr,idx-2,dp)+arr[idx];
        
        return dp[idx]=Math.max(pick,notpick);
    }
}