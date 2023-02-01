//RECURSIVE
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0)    return false;
        return n>0 && ( n==1 || n%4==0 && isPowerOfFour(n/4));
    }
}