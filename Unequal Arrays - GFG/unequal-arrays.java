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
            
            int N;
            N = Integer.parseInt(br.readLine());
            
            
            int[] A = IntArray.input(br, N);
            
            
            int[] B = IntArray.input(br, N);
            
            Solution obj = new Solution();
            long res = obj.solve(N, A, B);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends

//https://www.youtube.com/watch?v=zPLm20aGrIw
class Solution {
    public static long solve(int N, int[] A, int[] B) {
        // code here
        Arrays.sort(A);
        Arrays.sort(B);
        
        long sumA=0,sumB=0;
        ArrayList<Integer> A_odds=new ArrayList<>();
        ArrayList<Integer> A_even=new ArrayList<>();
        ArrayList<Integer> B_odds=new ArrayList<>();
        ArrayList<Integer> B_even=new ArrayList<>();
        
        for(int i=0;i<N;i++){
            sumA+=A[i];
            sumB+=B[i];
            if(A[i]%2==0){
                A_even.add(A[i]);
            }else{
                A_odds.add(A[i]);
            }
            if(B[i]%2==0){
                B_even.add(B[i]);
            }else{
                B_odds.add(B[i]);
            }
        }
        
        if(sumA!=sumB ||A_odds.size()!=B_odds.size()){
            return -1;
        }
        
        long ans=0;
        
        for(int i=0;i<A_odds.size();i++){
            ans+=Math.abs(A_odds.get(i)-B_odds.get(i));
        }
        for(int i=0;i<A_even.size();i++){
            ans+=Math.abs(A_even.get(i)-B_even.get(i));
        }
        
        return ans/4;
    }
}
        
