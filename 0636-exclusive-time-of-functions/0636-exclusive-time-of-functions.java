class Solution {
    class Pair{
        int id;
        int start;
        int childtime;
    }
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] time=new int[n];
        
        Stack<Pair> st=new Stack<>();
        
        for(int i=0;i<logs.size();i++){
            String l=logs.get(i);
            String[] log=l.split(":");
            
            if(log[1].equals("start")){
                Pair p=new Pair();
                p.id=Integer.parseInt(log[0]);
                p.start=Integer.parseInt(log[2]);
                p.childtime=0;
                
                st.push(p);
            }else{//means end
                Pair p=st.pop();
                int interval=Integer.parseInt(log[2])-p.start+1;
                int time_of_p=interval-p.childtime;
                
                time[p.id]+=time_of_p;
                
                if(st.size()>0){
                    st.peek().childtime+=interval;
                }
            }
        }
        return time;
    }
}