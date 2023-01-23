class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] trusted=new int[n+1];
        
        for(int[] t:trust){
            trusted[t[0]]--;
            trusted[t[1]]++;
        }
        for(int i=1;i<trusted.length;i++){
            if(trusted[i]==n-1){
                return i;
            }
        }
        return -1;
    }
}