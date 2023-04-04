//TC-0(M*N LOG(D))// D IS DIAGINAL ELEMENTS WHICH IS MIN OF M,N
//SC-0(M*N)
class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        
        Map<Integer,PriorityQueue<Integer>> map=new HashMap<>();
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int diagonal_index=i-j;
                
                PriorityQueue<Integer> pq=map.getOrDefault(diagonal_index,new PriorityQueue<>());
                pq.offer(mat[i][j]);
                map.put(diagonal_index,pq);
            }
        }
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                PriorityQueue<Integer> pq=map.get(i-j);
                mat[i][j]=pq.poll();
            }
        }
        return mat;
    }
}