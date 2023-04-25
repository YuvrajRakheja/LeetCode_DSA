//TC-0(M*N)
//SC-0(N)
//SPACE OPTIMIZATION
class Solution {
    public int minDistance(String word1, String word2) {
        int[] prev=new int[word2.length()+1];
        int[] curr=new int[word2.length()+1];
        //dp of 1 size greater to incorporate negative base cases
        
        for(int j=0;j<=word2.length();j++){
            prev[j]=j;    
        }
    
        for(int i=1;i<=word1.length();i++){
            curr[0]=i;
            
            for(int j=1;j<=word2.length();j++){
                if(word1.charAt(i-1)==word2.charAt(j-1)){
                    curr[j]=prev[j-1];
                }else{
                    curr[j]=1+Math.min(curr[j-1],Math.min(prev[j],prev[j-1]));
                }
            }
            prev=curr;
            curr=new int[word2.length()+1];
        }
        
        return prev[word2.length()];            
    }
}