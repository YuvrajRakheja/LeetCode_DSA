class Solution {
    public int[] smallestRange(List<List<Integer>> nums) {
        int[] ans={-100000,100000};
        
        int max=Integer.MIN_VALUE;
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        int k=nums.size();
        for(int i=0;i<k;i++){
            int ele=nums.get(i).get(0);//element to be inserted
            int[] tba={ele,0,i};//to be added
            max=Math.max(max,ele);
            
            pq.add(tba);//1st is element 2nd is index of ele in that array 3rd is list index 
        }
        
        while(true){
            int[] min=pq.poll();
            if(ans[1]-ans[0]>max-min[0]){
                ans[0]=min[0];
                ans[1]=max;
            } 
            min[1]++;
            
           // max=Math.max(max,min[0]);//not required as its effect is already taken
            List<Integer> slt=nums.get(min[2]);//semi list
            
            if(min[1]==slt.size()){
                break;
            }else{
                min[0]=slt.get(min[1]);
                max=Math.max(max,min[0]);
                pq.add(min);
            }
        }
        return ans;
    }
}