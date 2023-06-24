class Solution {
    public int tallestBillboard(int[] rods) {
        int n = rods.length, rsum = 0, cache[][] = new int[n][10001];
        
        for (var mem : cache){
            Arrays.fill(mem, -1);
        }
        
        return solve(0, 0, rods, cache);
    }
    private int solve(int i, int diff, int[] rods, int[][] cache) {
        // base case
        if (i == rods.length)
            return diff == 0 ? 0 : Integer.MIN_VALUE;
        
        // if calculated earlier
        if (cache[i][diff+5000] != -1) return cache[i][diff+5000];
    
        int left = rods[i] + solve(i + 1, diff + rods[i], rods, cache); 
        int right = solve(i + 1, diff - rods[i], rods, cache);          
        int none = solve(i + 1, diff, rods, cache);                     
        
        return cache[i][diff+5000] = Math.max(none, Math.max(left, right));
    }
}
