class Solution {
    public List<Integer> intersection(int[][] nums) {
        List<Integer> ans=new ArrayList<>();
        int[] count=new int[1001];
        
        for(int[] n:nums){
            for(int val:n){
                count[val]++;        
            }
        }
        
        for(int i=0;i<count.length;i++){
           if(count[i]==nums.length){
               ans.add(i);
           }
       }

        return ans;
    }
}