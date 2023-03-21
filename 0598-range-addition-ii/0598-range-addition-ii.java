//TC-0(OPS)
//SC-0(1)

class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int row_min=m,col_min=n;
        
        for(int i=0;i<ops.length;i++){
            row_min=Math.min(ops[i][0],row_min);
            col_min=Math.min(ops[i][1],col_min);//intutuion is min row number has actually more operations performed on it
        }
        return row_min*col_min;
    }
}