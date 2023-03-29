class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i=0,j=people.length-1;
        int min_boats=0;
        
        while(i<=j){
            if(people[i]+people[j]<=limit){
                min_boats++;
                i++;
                j--;
            }else{//people[i]+people[j]>limit  toh bhari wale ko bitha do
                min_boats++;
                j--;
            }
        }
        return min_boats;
    }
}