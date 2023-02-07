class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer,Integer> map=new HashMap<>();
        int i=0,j=0;
        int ans=0;
        
        while(i<fruits.length){
            
            map.put(fruits[i],map.getOrDefault(fruits[i],0)+1);
            
            while(map.size()>2){
                if(map.get(fruits[j])==1){
                    map.remove(fruits[j]);
                }else{
                    map.put(fruits[j],map.getOrDefault(fruits[j],0)-1);
                }
                j++;
            }
            ans=Math.max(ans,i-j+1);
            i++;
        }
        return ans;
    }
}