//TC-0(N)
//SC-0(1)
class Solution {
    public int minOperations(int n) {
        int ans=0;
        // N=4   1 3 5 7
        //MEAN=4
        //DIFFERENCE IS -3 -1 +1 +3
        //SO OPERATIONS TO BE CARRIED IS 3+1=4
        for(int i=1;i<n;i+=2){
            ans+=n-i;
        }
        return ans;
    }
}