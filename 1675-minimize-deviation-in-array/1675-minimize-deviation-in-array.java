//https://www.youtube.com/watch?v=6tsQpG5OIVg
class Solution {
    public int minimumDeviation(int[] nums) {
        TreeSet<Integer> st=new TreeSet<>();
        
        for(int ele:nums){
            if(ele%2==1){
                st.add(ele*2);
            }else{
                st.add(ele);
            }
        }
        //now all are even
        int mindiff=Integer.MAX_VALUE;
        
        while(true){
            int maxele=st.last();//gives largest
            int minele=st.first();//gives smallest
            
            mindiff=Math.min(mindiff,maxele-minele);
            
            if(maxele%2==0){
                st.remove(maxele);
                st.add(maxele/2);//adding half to minimize diff
            }else{
                return mindiff;
            }
        }
    }
}