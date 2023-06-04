
class Solution {
    //using DisjointSet
    //find the count of ultimate parent of the components 
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int m = isConnected[0].length;

        DisjointSet ds = new DisjointSet(n);
        

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(isConnected[i][j] == 1){
                    ds.unionBySize(i,j);
                }
            } 
        }

        int count = 0;
        for(int i=0; i<n; i++){
            if(ds.parent.get(i) == i)count++;
        }
        return count;
    }
}
class DisjointSet{
    List<Integer> size = new ArrayList<>();
    List<Integer> parent = new ArrayList<>();

    public DisjointSet(int n){
        for(int i=0; i<=n; i++){
            parent.add(i);
            size.add(1);
        }
    }

    public int findUparent(int node){
        if(node == parent.get(node))
            return node;

        int ult_p = findUparent(parent.get(node));
        parent.set(node,ult_p);
        return parent.get(node);
    }

    public void unionBySize(int u,int v){
        int ult_u = findUparent(u);
        int ult_v = findUparent(v);

        if(ult_u == ult_v)return;

        if(size.get(ult_u) < size.get(ult_v)){
            parent.set(ult_u,ult_v);
            size.set(ult_v , size.get(ult_u) + size.get(ult_v));
        }else{
            parent.set(ult_v,ult_u);
            size.set(ult_u , size.get(ult_u) + size.get(ult_v));
        }
    }
}
