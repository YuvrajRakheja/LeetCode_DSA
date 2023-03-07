//TC-0(NLOGN)
//SC-0(1)
//https://www.youtube.com/watch?v=2KwJ0zHBGI8
class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        
        long low=1;
        long min=time[0];
        
        for(int val:time){
            min=Math.min(min,val);
        }
        long high=totalTrips*min;//as with this minimum * totaltrips gives maximum time if min time taking bus runs only one after one
        
        while(low<=high){
            long mid=(high-low)/2+low;
            
            long tt=calc_total_trips(mid,time);
            
            if(tt<totalTrips){
                low=mid+1;//increase time as trips are less than totalTrips
            }else{
                high=mid-1;
            }
        }
        return low;
    }
    public long calc_total_trips(long timeassumed,int[] time){
        long count=0L;
        
        for(long val:time){
            count+=timeassumed/val;
        }
        return count;
    }
}