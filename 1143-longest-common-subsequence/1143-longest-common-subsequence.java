//TC-0(M*N)
//SC-0(M) 
//Tabulation Space optimized
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[] prev=new int[text2.length()+1];
        int[] curr=new int[text2.length()+1];
        //here as base case were negative so it will have many case so we follow index shifting technique
        //shift index by 1
        
        
        for(int i=1;i<=text1.length();i++){
            for(int j=1;j<=text2.length();j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    curr[j]=1+prev[j-1];
                }else{
                    curr[j]=Math.max(prev[j],curr[j-1]);
                }
            }
            prev=(int[])curr.clone();
        }
        return prev[text2.length()];
    }
}