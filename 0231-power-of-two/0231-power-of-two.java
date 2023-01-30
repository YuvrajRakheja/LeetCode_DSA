//TC-0(1)
//SC-0(1)
//BITS
class Solution {
    public boolean isPowerOfTwo(int n) {
        return n>0 && ((n&(n-1))==0);
    }
}