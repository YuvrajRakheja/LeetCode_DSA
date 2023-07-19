class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
        int ans = 0;
        int lastEnd = intervals[0][1];

        for(int i = 1; i < intervals.length; i++){
            if(intervals[i][0] < lastEnd){
                ans++;
            }else{
                lastEnd = intervals[i][1];
            }
        }

        return ans;
    }
}
