class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        double[][] car=new double[position.length][2];
        
        for(int i=0;i<position.length;i++){
            car[i][0]=position[i]*1d;//position of ith car
            car[i][1]=(target-position[i])*1d/speed[i];//calculates time reqd for ith car to reach target
        }
        
        Arrays.sort(car,(a,b)->(Double.compare(a[0],b[0])));
        
        int fleet=1;
        double cardata=car[position.length-1][1];
        
        for(int i=position.length-2;i>=0;i--){
            if(car[i][1]>cardata){
                cardata=car[i][1];
                fleet++;
            }           
        }
        return fleet;
    }
}