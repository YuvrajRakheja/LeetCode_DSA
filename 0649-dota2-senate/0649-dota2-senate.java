//https://www.youtube.com/watch?v=cWStUKPkl5Q
class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> radiantq=new LinkedList<>();
        Queue<Integer> direq=new LinkedList<>();
        
        for(int i=0;i<senate.length();i++){
            char ch=senate.charAt(i);
            if(ch=='R')     radiantq.add(i);
            else            direq.add(i);
        }//stored index of occurence of r and d
        //for each r and d it is optimal to kill the leftmost senate of its counter
        
        while(radiantq.size()>0 && direq.size()>0){
            int r=radiantq.remove();
            int d=direq.remove();
            
            if(r>d){//d marega r ko
                direq.add(d+senate.length());// we r adding because the game continues in round fashion
            }else{//r marega d ko
                radiantq.add(r+senate.length());
            }
        }
        
        return (radiantq.size()!=0)?"Radiant":"Dire";
    }
}