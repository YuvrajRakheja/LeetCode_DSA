class Solution {
    public double average(int[] salary) {
        double sum=0,min=Math.pow(10,9),max=-Math.pow(10,9);
        int n=salary.length;
        
        for(int val:salary){
            min=Math.min(min,val);
            max=Math.max(max,val);
            sum+=val;            
        }
        return (sum-min-max)/(n-2);
    }
}