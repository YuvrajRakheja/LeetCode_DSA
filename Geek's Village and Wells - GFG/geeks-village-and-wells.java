//{ Driver Code Starts
import java.util.*;
import java.io.*;

class Gfg {
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t=Integer.parseInt(in.readLine());
        while(t-->0){
            
            String s[]=in.readLine().trim().split(" ");
            int n=Integer.parseInt(s[0]);
            int m=Integer.parseInt(s[1]);
            char c[][]=new char[n][m];
            for(int i=0;i<n;i++){
                s=in.readLine().trim().split(" ");
                for(int j=0;j<m;j++){
                    c[i][j]=s[j].charAt(0);
                }
            }
            Solution ob=new Solution();
            int ans[][]=ob.chefAndWells(n, m, c);

            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    out.print(ans[i][j]+" ");
                }
                out.println();
            }
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    public class Pair{
        int i=0,j=0;
        
        Pair(int i,int j){
            this.i=i;
            this.j=j;
        }
    }
    
    int[] dirx={-1,1,0,0};
    int[] diry={0,0,-1,1};
    
    public int[][] chefAndWells(int n,int m,char c[][])
    {
        int[][] distance=new int[n][m];
        boolean[][] visited=new boolean[n][m];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                distance[i][j]=-1;
            }
        }
        
        Queue<Pair> q=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(c[i][j]=='W'){
                    q.add(new Pair(i,j));
                    visited[i][j]=true;
                }
                if(c[i][j]=='W'||c[i][j]=='.'||c[i][j]=='N'){
                    distance[i][j]=0;
                }
            }
        }
        int dist=2;
        
        while(!q.isEmpty()){
            int qsize=q.size();
                while(qsize-->0){
                    Pair it=q.remove();
                    int i=it.i,j=it.j;
                
                    for(int k=0;k<4;k++){
                        int curi=i+dirx[k];
                        int curj=j+diry[k];
                        
                        if(curi>=0 && curj>=0 && curi<n && curj<m && !visited[curi][curj] && c[curi][curj]!='N'){
                            visited[curi][curj]=true;
                            q.add(new Pair(curi,curj));
                            if(c[curi][curj]=='H'){
                                distance[curi][curj]=dist;
                            }
                        }
                    }
                
                }
            dist+=2;
        }
        return distance;
    }
    
}