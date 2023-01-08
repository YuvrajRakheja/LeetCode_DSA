class Solution {
    public int maxPoints(int[][] points) {
        if(points.length<=0)    return 0;
        if(points.length<=2)    return points.length;
        
        int max=1;
        
        for(int[] point_fixed:points){
            //double stores slope of the point caculated and integer stores frequency of that particular slope
            //Here we are fixing one point and iterating over others and calculate slope and make max freq. as answer
            HashMap<Double,Integer> map=new HashMap<>();
            for(int[] point2:points){
                
                if(point_fixed==point2) continue;
                
                double slope=0;
                
                if(point_fixed[0]==point2[0]){//means 2 point are  on vertival line so dont calculate slope as it would give error by formula
                    slope=Double.POSITIVE_INFINITY;
                }else{
                    slope=(point2[1]-point_fixed[1])/(double)(point2[0]-point_fixed[0]);//it is basically y2-y1/x2-x1
                }
                map.put(slope,map.getOrDefault(slope,0)+1);
                if(map.get(slope)>max){
                    max=map.get(slope);//updating max frequency;
                }
            }
        }
        return max+1;//since we r fixing one point and it will always be included so add 1
    }
}