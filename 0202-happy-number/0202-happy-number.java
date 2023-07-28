class Solution {
    public boolean isHappy(int n) {
        while(n>4){
            n=digit(n);
        }
        return n==1;
    }
    public int digit(int num){
        int sum=0;
        while(num>0){
            int dig=num%10;
            sum+=(dig*dig);
            num/=10;
        }
        return sum;        
    }
}