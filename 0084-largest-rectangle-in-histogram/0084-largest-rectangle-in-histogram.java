//TC-0(N)
//SC-0(N)
//https://www.youtube.com/watch?v=X0X6G-eWgQ8
class Solution {
    public int largestRectangleArea(int[] heights) {
        int[] rse=new int[heights.length];
        
        Stack<Integer> st=new Stack<>();
        for(int i=heights.length-1;i>=0;i--){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            
            rse[i]=(st.size()>0)?st.peek():heights.length;
            
            st.push(i);
        }
        
        st=new Stack<>();
        int[] lse=new int[heights.length];
        for(int i=0;i<heights.length;i++){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            
            lse[i]=(st.size()>0)?st.peek():-1;
            
            st.push(i);
        }
        
        int area=0;
        for(int i=0;i<heights.length;i++){
            area=Math.max(area,(rse[i]-lse[i]-1)*heights[i]);
        }
        return area;
    }
}