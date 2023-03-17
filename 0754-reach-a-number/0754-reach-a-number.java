//TC-0(SQRT(TARGET))
//SC-0(1)
//FOR MORE LOGIC SEE https://www.youtube.com/watch?v=fsips_0hwEA&list=TLGGm28WXY5OtPExNzAzMjAyMw
class Solution {
    public int reachNumber(int target) {
        int jump=1,sum=0;
        if(target<0){
            target=-target;
        }
        
        while(target>sum){
            sum+=jump;
            jump++;
        }
        
        if((sum-target)%2==0){
            return jump-1;//actual jumps(jump-1) and we reverse at move jump=(sum-target)/2;
        }else if((sum+jump-target)%2==0){//even after one jump
            return jump;
        }else{
            return jump+1;//2 odds make even
        }
    }
}