//TC-0(M*N)
//SC-0(N)
//SPACE OPTIMIZATION

class Solution {
    public int numDistinct(String s, String t) {
        int[] prev=new int[t.length()+1];
        int[] curr=new int[t.length()+1];
        
        // for(int i=0;i<=s.length();i++){
        //     dp[i][0]=1;
        // }
        prev[0]=curr[0]=1;
        
        for(int j=1;j<=t.length();j++){
            prev[j]=0;
        }//negative base cases
        
        for(int i=1;i<=s.length();i++){
            for(int j=1;j<=t.length();j++){
                if(s.charAt(i-1)==t.charAt(j-1)){
                    curr[j]=(prev[j-1]+prev[j]);
                }else{
                    curr[j]=prev[j];
                }
            }
            prev=curr;
            curr=new int[t.length()+1];
            curr[0]=1;
        }
        return prev[t.length()];
    }
}