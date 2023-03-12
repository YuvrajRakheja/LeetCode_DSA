//TC-0(N*M LOG(N*M))
//SC-0(N)

class Solution {
    public int trapRainWater(int[][] heightMap) {
        int m=heightMap.length;
        int n=heightMap[0].length;
        
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        boolean[][] visited=new boolean[m][n];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0||j==0||i==m-1||j==n-1){
                    pq.add(new Pair(i,j,heightMap[i][j]));
                    visited[i][j]=true;
                }
            }
        }
        
        int water=0;
        int[][] dir={{0,1},{0,-1},{1,0},{-1,0}};
        
        while(pq.size()>0){
            Pair p=pq.remove();
            
            for(int[] dirs:dir){
                int row_dash=p.row+dirs[0];
                int col_dash=p.column+dirs[1];
                
                if(row_dash>=0 && col_dash>=0 && row_dash<m && col_dash<n && visited[row_dash][col_dash]==false){
                    water+=Math.max(0,p.height-heightMap[row_dash][col_dash]);
                    
                    if(heightMap[row_dash][col_dash]>=p.height){
                        pq.add(new Pair(row_dash,col_dash,heightMap[row_dash][col_dash]));
                    }else{
                        pq.add(new Pair(row_dash,col_dash,p.height));
                    }
                    visited[row_dash][col_dash]=true;
                }
            }
        }
        return water;
        
    }
    public class Pair implements Comparable<Pair>{
        int row;
        int column;
        int height;
        
        Pair(int row,int column,int height){
            this.row=row;
            this.column=column;
            this.height=height;
        }
        
        @Override
        public int compareTo(Pair o){
            return this.height-o.height;    
        }
    }
}