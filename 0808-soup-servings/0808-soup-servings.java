//TC-0(n^2)
//SC-0(n^2)
class Solution {
    public double soupServings(int n) {
         if(n>4800)    return 1.0;//prob above 4800 is nearly 1 bcs a is more likely to end first with greater n.
        
          return helper(n,n,new Double[n+1][n+1]);
    }
    public double helper(int A,int B,Double[][] dp){
        if(A<=0 && B<=0)    return 0.5;//When both empty at same time
        if(A<=0)    return 1.0;//A empty first
        if(B<=0)    return 0.0;//only B empty
        
        if(dp[A][B]!=null)   return dp[A][B];
        
        int[] a_portion={100,75,50,25};
        int[] b_portion={0,25,50,75};
        
        dp[A][B]=0.0;
        for(int i=0;i<4;i++){
            dp[A][B]+=helper(A-a_portion[i],B-b_portion[i],dp);
        }
        
        dp[A][B]/=4.0;//to get probability divide by 4
        return dp[A][B];
    }
}