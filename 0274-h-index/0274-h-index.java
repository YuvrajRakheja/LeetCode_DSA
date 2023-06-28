//https://www.youtube.com/watch?v=ydiAVn7bm6g
class Solution {
    public int hIndex(int[] citations) {
        int[] hindx=new int[citations.length+1];//citations length is 4 so we can have atmosst 4 pprs with 4 at least 4 citaitons so answer is 4.we maintains hindx array and store 4 at index 4 so being 0 index require 1 greater szize
        
        for(int i=0;i<citations.length;i++){
            if(citations[i]>=citations.length)   hindx[hindx.length-1]++;
            else    hindx[citations[i]]++;
        }
        int papers=0;
        for(int i=hindx.length-1;i>=0;i--){
            papers+=hindx[i];
            if(papers>=i)   return i;
        }
        return -1;
    }
}