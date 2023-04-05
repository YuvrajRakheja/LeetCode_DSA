//TC-0(N)
//SC-0(N)
class Solution {
    public class Pair{
        char ch;
        int freq;
        Pair(char ch,int freq){
            this.ch=ch;
            this.freq=freq;
        }
    }
    public String reorganizeString(String s) {
        //1.Make map and store s frequency in it
        int[] map=new int[26];
        for(int i=0;i<s.length();i++){
            map[s.charAt(i)-'a']++;
        }
        //2.Make priorityQueue and store characters into it
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->(b.freq-a.freq));
        
        for(int i=0;i<26;i++){
            if(map[i]>0){
                pq.add(new Pair((char)('a'+i),map[i]));
            }
        }
        //3.Make answer and append first char
        StringBuilder ans=new StringBuilder();
        Pair block=pq.poll();
        ans.append(block.ch);
        block.freq--;
        
        //4.Append remaining
        while(pq.size()>0){
            Pair temp=pq.poll();
            ans.append(temp.ch);
            temp.freq--;
            if(block.freq>0){
                pq.offer(block);
            }
            block=temp;
        }
        // if(block.freq>0){
        //     return "";
        // }
        if(ans.length() !=s.length()){
            return "";
        }
        return ans.toString();
    }
}