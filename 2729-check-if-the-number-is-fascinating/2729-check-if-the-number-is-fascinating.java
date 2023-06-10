class Solution {
    public boolean isFascinating(int n) {
        int[] cnt=new int[10];//from 0 to 9
        
        StringBuilder sb=new StringBuilder(Integer.toString(n));
        
        sb.append(Integer.toString(2*n));
        sb.append(Integer.toString(3*n));
        
        for(int i=0;i<sb.length();i++){
            char ch=sb.charAt(i);
            cnt[ch-'0']++;           
        }
        
        for(int i=1;i<10;i++){
            if(cnt[i]==0 ||cnt[i]>1){
                return false;
            }
        }
        return true;
    }
}