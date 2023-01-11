//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			
            Solution ob = new Solution();
            ArrayList<Integer> primes  = ob.sieveOfEratosthenes(N);
            for(int prime : primes) {
                System.out.print(prime+" ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//Tc-0(nlog(logn))

class Solution{
    static ArrayList<Integer> sieveOfEratosthenes(int N){
        // code here
        
        ArrayList<Integer> ans=new ArrayList<>();
        boolean[] prime=new boolean[N+1];
        Arrays.fill(prime,true);
        //true means prime false means not prime
        
        
        for(int i=2;i*i<=N;i++){
            if(prime[i]==true){
                for(int j=2*i;j<=N;j+=i){
                    prime[j]=false;
                }
            }
        }
        for(int i=2;i<=N;i++){//as 0 and 1 are non primes
            if(prime[i]==true){
                ans.add(i);
            }
        }
        return ans;
    }
}