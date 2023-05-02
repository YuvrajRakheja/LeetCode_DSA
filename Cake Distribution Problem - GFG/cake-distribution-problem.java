//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG{
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		while(test-- > 0) {
			String [] str = br.readLine().trim().split(" ");
			int n = Integer.parseInt(str[0]);
			int k = Integer.parseInt(str[1]);
			int [] sweetness = new int[n];
			str = br.readLine().trim().split(" ");
			int i = 0;
			for(String s: str) {
				sweetness[i++] = Integer.parseInt(s);
			}
			Solution obj = new Solution();
			System.out.println(obj.maxSweetness(sweetness, n, k));
		}
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution{
	int maxSweetness(int [] sweetness, int N, int K) {
        int min=Integer.MAX_VALUE;
        int max=0;
        
        for(int i=0;i<N;i++){
            min=Math.min(min,sweetness[i]);//when many people so geek gets minimum
            max+=sweetness[i];//when no one is there all sweets of geek
        }
        
        //now as the geek share can be between min and max so apply binary search
        int low=min,high=max;
        int ans=0;
        
        while(low<=high){
            int mid=low+(high-low)/2;
            
            if(isPossible(mid,K,sweetness)){
                ans=mid;
                //as we need to maximize sweetness so move the pointer rightwards
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return ans;
	}
	public boolean isPossible(int mid,int k,int[] arr){
	    int sum=0,person=0;
	    
	    for(int i=0;i<arr.length;i++){
	        sum+=arr[i];
	        if(sum>=mid){
	            person++;
	            sum=0;
	        }
	    }
	    return person>=k+1;
	}
}