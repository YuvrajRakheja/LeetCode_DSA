//TC-0(N)
//SC-0(1)
class Solution {
    public int minFlips(String target) {
        int future=0;
        int count=0;
        
        for(int i=0;i<target.length();i++){
            if(target.charAt(i)-'0'==future)   continue;
            
            future=(future==0)?1:0;
            count++;
        }
        return count;
    }
}