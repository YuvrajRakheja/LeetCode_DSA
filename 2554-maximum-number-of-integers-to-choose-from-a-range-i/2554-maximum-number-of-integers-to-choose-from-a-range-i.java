class Solution {
    public int maxCount(int[] banned, int n, int maxsum) {
        Set<Integer> ban=new HashSet<>();
        for(int val:banned){
            ban.add(val);
        }
        int ans=0;
        for(int i=1;i<=n;i++){
            if(maxsum>=i){
                if(!ban.contains(i)){
                    maxsum-=i;
                    ans++;
                }
            }
        }
        return ans;
    }
}