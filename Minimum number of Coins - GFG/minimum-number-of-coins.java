//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            List<Integer> numbers= new ArrayList<Integer>();
            numbers = ob.minPartition(N);
            for(int i: numbers){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static List<Integer> minPartition(int N)
    {
        // code here
        List<Integer> ans=new ArrayList<>();
        
        
        while(N>0){
            if(N>=2000){
                ans.add(2000);
                N-=2000;
            }else if(N>=500){
                ans.add(500);
                N-=500;
            }else if(N>=200){
                ans.add(200);
                N-=200;
            }else if(N>=100){
                ans.add(100);
                N-=100;
            }else if(N>=50){
                ans.add(50);
                N-=50;
            }else if(N>=20){
                ans.add(20);
                N-=20;
            }else if(N>=10){
                ans.add(10);
                N-=10;
            }else if(N>=5){
                ans.add(5);
                N-=5;
            }else if(N>=2){
                ans.add(2);
                N-=2;
            }else{
                ans.add(1);
                N-=1;
            }
        }
        return ans;
    }
}