//TC-0(LOGN)
//SC-0(1)
//RECURSION
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
        
        return n>0 && ((n==1)|| n%2==0 && isPowerOfTwo(n/2));
    }
}