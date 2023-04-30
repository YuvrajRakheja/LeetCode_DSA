//TC-0(N)
//SC-0(1)
class Solution {
    public int isWinner(int[] player1, int[] player2) {
        int sum1=0,sum2=0;
        
        for(int i=0;i<player1.length;i++){
            sum1+=player1[i];
            sum2+=player2[i];
            
            if((i>=1 && player1[i-1]==10)||(i>=2 && player1[i-2]==10)){
                sum1+=player1[i];
            }
            if((i>=1 && player2[i-1]==10)||(i>=2 && player2[i-2]==10)){
                sum2+=player2[i];
            }
        }
        
        if(sum1>sum2)   return 1;
        else if(sum1<sum2)  return 2;
        else    return 0;
    }
}