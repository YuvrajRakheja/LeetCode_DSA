//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG{
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		while(test-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int [] arr = new int[n];
			String [] str = br.readLine().trim().split(" ");
			for(int i = 0; i < n; i++)
				arr[i] = Integer.parseInt(str[i]);
			Solution ob = new Solution();
			int [] ans = ob.nearestSmallestTower(arr);
			for(int i = 0; i < n; i++)
				System.out.print(ans[i]+" ");
			System.out.println();
		}
		
	}
}
// } Driver Code Ends


//User function Template for Java


class Solution{
	int [] nearestSmallestTower(int [] arr){
		int n=arr.length;
		int[] ans=new int[n];
		
		int[] nser=new int[n];
		nser=getsmallerright(arr);
		
		int[] nsel=new int[n];
		nsel=getsmallerleft(arr);
		
		for(int i=0;i<n;i++){
		    if(nser[i]==nsel[i]){//both are equal only when they are -1
		        ans[i]=-1;
		    }else if(nser[i]==-1){
		        ans[i]=nsel[i];
		    }else if(nsel[i]==-1){
		        ans[i]=nser[i];  
		    }else if(i-nsel[i]<nser[i]-i){//left wale ka distance kam hai
		        ans[i]=nsel[i];
		    }else if(i-nsel[i]>nser[i]-i){//right wale ka distance kam hai
		        ans[i]=nser[i];
		    }else if(arr[nser[i]]<arr[nsel[i]]){//same distance hai so pick smallest tower and agar left wala bada hai so pick right 
		        ans[i]=nser[i];
		    }else{//same distance and right bada hai toh take left ya agar equal distance hai toh bhi smallest index lena hai so left
		        ans[i]=nsel[i];
		    }
		}
		return ans;
		
	}
	public int[] getsmallerright(int[] arr){
	    int [] ans=new int[arr.length];
	 
	    Stack<Integer> st=new Stack<>();
	    
	    for(int i=arr.length-1;i>=0;i--){
	        while(st.size()>0 && arr[i]<=arr[st.peek()]){
	            st.pop();
	        }   
	        if(st.size()==0){
	            ans[i]=-1;
	        }else{
	            ans[i]=st.peek();
	        }
	        st.push(i);
	    }
	    return ans;
	}
	public int[] getsmallerleft(int[] arr){
	    int[] ans=new int[arr.length];
	    Stack<Integer> st=new Stack<>();
	    
	    for(int i=0;i<arr.length;i++){
	        while(st.size()>0 && arr[i]<=arr[st.peek()]){
	            st.pop();
	        }
	        if(st.size()==0){
	            ans[i]=-1;
	        }else{
	            ans[i]=st.peek();
	        }
	        st.push(i);
	    }
	    
	    return ans;
	}
}