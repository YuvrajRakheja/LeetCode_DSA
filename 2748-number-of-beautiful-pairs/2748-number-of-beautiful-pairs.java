class Solution {
    public int countBeautifulPairs(int[] nums) {
        int count=0;
        
        for(int i=0;i<nums.length;i++){
            int first_num=nums[i];
            
            while(first_num>9)  first_num/=10;//taking first letter
            
            for(int j=i+1;j<nums.length;j++){
                int last_num=nums[j];
                
                last_num=last_num%10;//taking last letter
                
                if(gcd(first_num,last_num)==1)    count++;
            } 
        }
        return count;
    }
    public int gcd(int first_num,int last_num){
        if (last_num == 0) return first_num;
        return gcd(last_num, first_num % last_num);
        
    }
}