class Solution {
    public int minDeletionSize(String[] strs) {
        int cnt=0;
        for(int j=0;j<strs[0].length();j++){//traversing over columns
            for(int i=1;i<strs.length;i++){//over rows
                if(strs[i-1].charAt(j)>strs[i].charAt(j)){
                    cnt++;
                    break;
                }
            }
        }
        return cnt;
        
    }
}