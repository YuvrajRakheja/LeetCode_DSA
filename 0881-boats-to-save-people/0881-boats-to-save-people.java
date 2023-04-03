//TC-0(NLOGN)
//SC-0(1)
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int left=0,right=people.length-1;
        int ans=0;
        
        while(left<=right){
            if(people[left]+people[right]>limit){
                ans++;
                right--;
            }else{
                ans++;
                left++;
                right--;
            }
        }
        return ans;
    }
}