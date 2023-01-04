//youtube.com/watch?v=gHR4VTNlVEI    see logic
class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int task:tasks){
            map.put(task,map.getOrDefault(task,0)+1);
        }
        
        int ans=0;
        
        for(int freq:map.values()){
            if(freq==1){
                return -1;
            }else{
                ans+=(freq+2)/3;//it will adjust when freq is of form 3p,3p+1,3p+2.It will include of 3p+1,3p+2 and when we add 2 and divide by 3 it is equal to freq/3+1 otherwise simply if it is 3p and if we add 2 and divide by 3 it is same
            }
        }
        return ans;        
    }
}