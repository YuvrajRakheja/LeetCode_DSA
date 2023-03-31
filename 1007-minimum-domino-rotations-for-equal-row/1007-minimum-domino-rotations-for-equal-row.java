//TC-0(N)
//SC-0(1)
class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int num1=tops[0],num2=bottoms[0];
        
        int count1=0;//count required to make top array as num1.
        int count2=0;//count required to make bottom array as num1.
        
        int count3=0;//count required to make bottom array as num2.
        int count4=0;//count required to make top array as num2.
        
        for(int i=0;i<tops.length;i++){
            if(count1!=Integer.MAX_VALUE){
                if(tops[i]==num1){
                    //nothing to do
                }else if(bottoms[i]==num1){
                    count1++;
                }else{
                    count1=Integer.MAX_VALUE;
                }
            }
            if(count2!=Integer.MAX_VALUE){
                if(bottoms[i]==num1){
                    //nothing to do
                }else if(tops[i]==num1){
                    count2++;
                }else{
                    count2=Integer.MAX_VALUE;
                }
            }
            if(count3!=Integer.MAX_VALUE){
                if(bottoms[i]==num2){
                    //nothing to do
                }else if(tops[i]==num2){
                    count3++;
                }else{
                    count3=Integer.MAX_VALUE;
                }
            }
            if(count4!=Integer.MAX_VALUE){
                if(tops[i]==num2){
                    //nothing to do
                }else if(bottoms[i]==num2){
                    count4++;
                }else{
                    count4=Integer.MAX_VALUE;
                }
            }
        }
        int ans=Math.min(Math.min(count1,count2),Math.min(count3,count4));
        
        return (ans!=Integer.MAX_VALUE)?ans:-1;
    }
}