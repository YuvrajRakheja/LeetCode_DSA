//TC-0(N)
//SC-0(H)
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        if(asteroids.length<=1)    return asteroids;
        
        Stack<Integer> st=new Stack<>();
        
        for(int i=0;i<asteroids.length;i++){
            int val=asteroids[i];
            if(val>0){
                st.push(val);
            }else{
                while(st.size()>0 && st.peek()>0 && st.peek()<-val){//incoming negative bigger
                    st.pop();
                }   
                if(st.size()>0 && st.peek()==-val){//the previous one was of same magnitude
                    st.pop();           
                }else if(st.size()>0 && st.peek()>-val){//nothing to do not pop and just dont add current val
                    
                }else{//previous one on stack is also negative
                    st.push(val);
                }
            }
        }
        int[] ans=new int[st.size()];
        for(int i=ans.length-1;i>=0;i--){
            ans[i]=st.pop();
        }
        return ans;
    }
}