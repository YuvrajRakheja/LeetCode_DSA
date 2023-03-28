//TC-0(N^2)
//SC-0(N)
//BRUTE FORCE
class Solution {
    public int maximumSwap(int num) {
        char[] digit=Integer.toString(num).toCharArray();
        int ans=num;
        
        for(int i=0;i<digit.length;i++){
            for(int j=i+1;j<digit.length;j++){
                if(digit[j]-'0' > digit[i]-'0'){
                    char temp=digit[i];
                    digit[i]=digit[j];
                    digit[j]=temp;
                    
                    ans=Math.max(ans,Integer.valueOf(String.valueOf(digit)));
                    //we are swaping once and updating ans and then nullifying the effect of swap so that it can be changed and tested for next set
                    temp=digit[i];
                    digit[i]=digit[j];
                    digit[j]=temp;
                }
            }
        }
        return ans;
    }
}