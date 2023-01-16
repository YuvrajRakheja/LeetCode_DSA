//TC-0(N)
//SC-0(N)
// NOTE    there are 2 types of space complexities

// space complexity (overall)
// auxiliary space complexity : it means the extra space needed in addition to what is needed for returning the answer
// generally when we talk about space complexity, we talk about auxiliary(extra) space needed, so in this case, since we are not using any extra space , in addition to our "temp" vector , our SC would be O(1)

// in interviews, do tell the interviewers both:
// overall space complexity : O(n*n)
// auxiliary space complexity: O(1)

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> ans=new ArrayList<>();

        //intervals[][] is already sorted we need to insert newinterval
        
        for(int[] i:intervals){
            if(i[1]<newInterval[0]){
                ans.add(new int[]{i[0],i[1]});
            }
            else if(i[0]>newInterval[1]){//if already given interval is bigger than interval to be inserted then add newinterval and update newinterval
                ans.add(newInterval);
                newInterval=i;
            }else{//overlapping area
                newInterval[0]=Math.min(newInterval[0],i[0]);
                newInterval[1]=Math.max(newInterval[1],i[1]);
            }
        }
        ans.add(newInterval);
        
        return ans.toArray(new int[0][]);
    }
}