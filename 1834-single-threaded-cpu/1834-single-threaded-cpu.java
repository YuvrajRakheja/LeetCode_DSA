//https://www.youtube.com/watch?v=gM6egF6_aac

class Solution {
    public int[] getOrder(int[][] tasks) {
        
        int[][] alltasks=new int[tasks.length][3];
        
        for(int i=0;i<tasks.length;i++){
            alltasks[i][0]=i;//index;
            alltasks[i][1]=tasks[i][0];//time when available
            alltasks[i][2]=tasks[i][1];//processing time
        }
        Queue<int[]> minheap = new PriorityQueue<>((a, b) -> a[2] - b[2] == 0 ? a[0] - b[0] : a[2] - b[2]);//minheap on basis of shortest processing time,if same then give with lower index
        Arrays.sort(alltasks,(a,b)-> a[1]-b[1]);//sort alltasks on basis of time availability
        
        int i=0,index=0,curTime=0;
        int[] result=new int[tasks.length];
        
        
        while(i<tasks.length){
            while(i<tasks.length && curTime>=alltasks[i][1]){
                minheap.add(alltasks[i++]);
            }
            if(minheap.isEmpty()){
                curTime=alltasks[i][1];
            }
            if(!minheap.isEmpty()){
                int[] removed=minheap.poll();
                result[index++]=removed[0];//storing index of result
                curTime+=removed[2];//adding processing time
            }
        }
        while(!minheap.isEmpty()){
            int[] removed=minheap.poll();//difference in poll and remove is that poll gives null if empty and remove return null if empty
            result[index++]=removed[0];//storing index of result
        }
        return result;
    }
}