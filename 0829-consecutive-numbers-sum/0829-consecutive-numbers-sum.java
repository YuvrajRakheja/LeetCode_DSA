//TC-0(SQRT(N))
//SC-0(1)
class Solution {
    public int consecutiveNumbersSum(int n) {
        int ans=0;
        for(int k=1;k*(k-1)<2*n;k++){
            int numerator=n-(k*(k-1)/2);
            int denominator=k;
            
            if(numerator%denominator==0){
                ans++;
            }
        }
        return ans;
    }
}