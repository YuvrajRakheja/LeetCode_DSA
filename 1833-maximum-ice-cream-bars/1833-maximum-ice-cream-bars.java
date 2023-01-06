//TC-0(N)
//SC-0(N)
//OPTIMIZED
//https://www.youtube.com/watch?v=LxPWNln-LQY
class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int[] fp=new int[100001];//frequency map of costs whose range 0 to 10^5
        
        for(int i=0;i<costs.length;i++){
            fp[costs[i]]++;
        }
        //we have stored frequency in array
        
        int i=1;//as i=0 is always 0 as costs[i]>=1
        int count=0;
        
        while(i<100001 && coins>=i){
            if((long)fp[i]*i>coins && coins>=i){//if particular cost coins greater than money we have to buy all coins of that type
                int bars=coins/i;//caluclate maximum nos of coins possible of given type
                coins-=bars*i;
                count+=bars;
                break;
            }
            if(fp[i]!=0 && coins>=i){
                coins-=fp[i]*i;
                count+=fp[i];
            }
            i++;
        }
        return count;
        
    }
}