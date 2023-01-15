//TC-0(N)
//SC-0(N)
//MOST OPTIMIZED APPROACH EARLIER TAKING 2 ITERATIONS HERE IN SINGLE ONLY
//https://www.youtube.com/watch?v=41VuLYR0btE&list=PL-Jc9J83PIiE1_SifBEWRsD-fzxrvkja9&index=6
class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st=new Stack<>();
        
        int area=0;
        
        for(int i=0;i<=heights.length;i++){//till <=n also include last index so as to clear 
            while(!st.isEmpty() && ((i==heights.length)||heights[st.peek()]>=heights[i])){
                int element_under_consideration=heights[st.peek()];
                st.pop();
                int width;
                if(st.isEmpty())    width=i;//rightsmall=i,leftsmall=-1 so width=i-(-1)-1=i
                else{
                    width=i-st.peek()-1;//rightsmall-leftsmall-1
                }
                
                area=Math.max(area,element_under_consideration*width);
            }
            st.push(i);
        }
        return area;
        
    }
}