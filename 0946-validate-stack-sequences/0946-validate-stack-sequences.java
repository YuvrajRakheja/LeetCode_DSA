class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int i=0,j=0;
        Stack<Integer> stp=new Stack<>();
        
        while(i<pushed.length){
            stp.push(pushed[i]);
            while(!stp.isEmpty() && stp.peek()==popped[j]){
                stp.pop();
                j++;
            }
            i++;
        }
        return stp.size()==0?true:false;
    }
}