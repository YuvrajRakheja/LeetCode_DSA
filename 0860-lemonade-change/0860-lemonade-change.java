class Solution {
    public boolean lemonadeChange(int[] bills) {
        int i=0;
        int chg5=0,chg10=0,chg20=0;
        
        while(i<bills.length){
            if(bills[i]==5){
                chg5++;
            }else if(bills[i]==10){
                chg10++;
                if(chg5==0) return false;
                chg5--;
            }else{
                chg20++;
                if(chg5==0 && chg10==0||(chg5==1||chg5==2) && chg10==0||chg5==0 && chg10>=1) return false;
                if(chg10!=0){
                    chg5--;
                    chg10--;    
                }else{
                    chg5-=3;
                }
                
            }    
            i++;
        }
        return true;
    }
}