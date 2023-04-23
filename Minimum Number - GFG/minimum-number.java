//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            
            int[] arr = IntArray.input(br, n);
            
            Solution obj = new Solution();
            int res = obj.minimumNumber(n, arr);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int minimumNumber(int n, int[] arr) {
        // code here
        int gcd=Integer.MAX_VALUE;
        
        //method 2 by gcd method
        
        for(int i=0;i<n;i++){
            gcd=Math.min(gcd,arr[i]);
        }
        
        for(int i=0;i<n;i++){
            int n1=gcd,n2=arr[i];
            while(n1>0 && n2>0){
                if(n1>n2)   n1=n1%n2;
                else    n2=n2%n1;
            }
            if(n1==0)   gcd=n2;
            else    gcd=n1;
        }
        return gcd;
    }
}
        
