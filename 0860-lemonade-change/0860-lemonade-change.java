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
                if(chg10>0 && chg5>0){
                    chg5--;
                    chg10--;
                }else if(chg5>=3){
                    chg5-=3;
                }else{
                    return false;
                }
                
            }    
            i++;
        }
        return true;
    }
}
