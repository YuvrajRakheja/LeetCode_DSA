//TC-0(N^2)

class Solution {
    public int maximalRectangle(char[][] matrix) {
        if(matrix==null || matrix.length==0) return 0;
        
        int[] heights=new int[matrix[0].length];
        int maxresult=0;
        
        for(int i=0;i<matrix[0].length;i++){
            if(matrix[0][i]=='1')   heights[i]=1;
        }
        maxresult=largest_rectangle(heights);
        
        for(int i=1;i<matrix.length;i++){
            reset(matrix,heights,i);
            maxresult=Math.max(largest_rectangle(heights),maxresult);      
        }
        return maxresult;
    }
    
    public int largest_rectangle(int[] heights){
        Stack<Integer> st=new Stack<>();
        int area=0;
        
        for(int i=0;i<=heights.length;i++){
            while(!st.isEmpty() && (i==heights.length || heights[st.peek()]>=heights[i])){
                int ht=heights[st.pop()];
                int width;
                if(st.isEmpty()){
                    width=i;
                }else{
                    width=i-st.peek()-1;
                }
                area=Math.max(area,ht*width);
            }
            st.push(i);
        }
        return area;
    }
    
    public void reset(char[][] matrix,int[] heights,int i){
        for(int j=0;j<heights.length;j++){
            if(matrix[i][j]=='1'){
                heights[j]+=1;
            }else{
                heights[j]=0;
            }
        }
    }
}