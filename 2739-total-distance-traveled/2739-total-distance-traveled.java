class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int sum=0;
        for(int i=1;i<=mainTank;i++){
            if(additionalTank!=0 && i%5==0){
                sum+=10;
                additionalTank--;
                mainTank++;
            }else{
                sum+=10;
            }
        }
        return sum;
    }
}