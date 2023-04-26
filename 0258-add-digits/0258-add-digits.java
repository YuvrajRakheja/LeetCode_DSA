class Solution {
    public int addDigits(int num) {
        int sum=0;
        
        while(num>0){
            sum+=num%10;
            num/=10;
            if(sum>9){
                int newsum=0;
                while(sum>0){
                    newsum+=sum%10;
                    sum/=10;
                }
                sum=newsum;
            }
        }
        return sum;
    }
}