//TC-0(N)
//SC-0(1)
//https://www.youtube.com/watch?v=Do2BcLMfyoE
class Solution {
    public int minFlipsMonoIncr(String s) {
        int zero_to_one=0;
        int ones_count=0;
        int i=0;
        
        while(i<s.length() && s.charAt(i)=='0'){
            i++;
        }
        
        for(;i<s.length();i++){
            if(s.charAt(i)=='0'){
                zero_to_one++;//FLIP 0->1
            }else{
                ones_count++;
            }
            
            if(zero_to_one>ones_count){//dry run 1 1 0 0 0 1 1 to get insight why this condition is written
                zero_to_one=ones_count;
            }
        }
        return zero_to_one;
        
    }
}