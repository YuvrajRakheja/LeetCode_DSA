//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class Array {
    
    // Driver code
    
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
	    Complete obj = new Complete();
		obj.precompute();    	
		// looping through all testcases
		while(testcases-- > 0){
		    String line = br.readLine();
		    String[] element = line.trim().split("\\s+");
		    int N = Integer.parseInt(element[0]);
		    int M = Integer.parseInt(element[1]);
		    int arr [][] = new int[M][2];
		    for(int i = 0;i<M;i++){
	            line = br.readLine();
		        String[] elements = line.trim().split("\\s+");
		        arr[i][0] = Integer.parseInt(elements[0]);
		        arr[i][1] = Integer.parseInt(elements[1]);    
	        }
            int ans = obj.helpSanta(N, M, arr);
            System.out.println(ans);
    	    
		}
	}
}




// } Driver Code Ends


//User function Template for Java


class Complete{
    static int cnt=0;
    static ArrayList<Integer> primes = new ArrayList<>();;

    public static void precompute () {
        //Complete the function
        int n=1000000;
        boolean[] v=new boolean[n+1];
        
        Arrays.fill(v,true);
        for(int i=2;i*i<=n;i++){
            if(v[i]){
                for(int j=i*i;j<=n;j+=i){
                    v[j]=false;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(v[i]){
                primes.add(i);
            }
        }
        
    }
    // Function for finding maximum and value pair
    public static int helpSanta (int n, int m, int g[][]) {
        //Complete the function
        ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
        
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        
        for(int i=0;i<m;i++){
            int u=g[i][0],v=g[i][1];
            
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        boolean[] vis=new boolean[n+1];
        int max=0;
        for(int i=0;i<=n;i++){
            if(!vis[i]){
                cnt=0;
                dfs(adj,i,vis);
                max=Math.max(max,cnt);
            }
        }
        if(max==1)  return -1;
        
        return primes.get(max-1);
    }
    public static void dfs(ArrayList<ArrayList<Integer>> adj,int i,boolean[] vis){
        vis[i]=true;
        cnt++;
        
        for(int it:adj.get(i)){
            if(!vis[it]){
                dfs(adj,it,vis);
            }
        }
    }
}