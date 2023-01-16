//TC-0(NLOGN)
//SC-0(N)

class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> ans=new ArrayList<>();
        if(intervals.length==0 || intervals==null){
            return ans.toArray(new int[0][]);
        }
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        
        int strt=intervals[0][0],end=intervals[0][1];
        
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]>end){
                ans.add(new int[]{strt,end});
                strt=intervals[i][0];
                end=intervals[i][1];
            }else{//overlapping part
                end=Math.max(intervals[i][1],end);
            }
        }
        ans.add(new int[]{strt,end});
        return ans.toArray(new int[0][]);
    }
}