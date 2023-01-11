//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {

            
            int i = 0;
            int N = Integer.parseInt(br.readLine().trim());
        
            int arr[] = new int[(int)(N)];
            
            String inputLine2[] = br.readLine().trim().split(" ");
            for ( i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(inputLine2[i]);
            }
        
            Solution ob = new Solution();
            System.out.println(ob.minIncrements(arr,N));
        }
    }
}

// } Driver Code Ends


// User function Template for Java
//Tc-0(nlogn)
//sc-0(1)
//https://www.youtube.com/watch?v=ojw8ydnA5Q8
class Solution {
    public long minIncrements(int[] arr, int N) {
        // Code here
        long count=0;
        Arrays.sort(arr);
        
        for(int i=1;i<N;i++){
            if(arr[i]<=arr[i-1]){//previous element bara hai
                long diff=(long)arr[i-1]-arr[i];//we calculate only differnece
                count+=(diff+1);//as if same then add 1 so that it differs from previous
                arr[i]+=diff+1;
            }
        }
        return count;
    }
}