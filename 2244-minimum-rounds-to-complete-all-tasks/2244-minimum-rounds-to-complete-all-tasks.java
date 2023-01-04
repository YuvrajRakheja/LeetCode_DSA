//youtube.com/watch?v=gHR4VTNlVEI    see logic
class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int task:tasks){
            map.put(task,map.getOrDefault(task,0)+1);
        }
        
        int ans=0;
        
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int freq=entry.getValue();
            
            if(freq==1){ //we would not be able to complete all tasks as we do only 2 or 3
                return -1;
            }else if(freq%3!=0){ //of form 3p+1 or 3p+2
                ans+=freq/3+1;
            }else{
                ans+=freq/3;
            }
        }
        return ans;        
    }
}