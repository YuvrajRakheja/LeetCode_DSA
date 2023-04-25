//TC-0(M*N)
//SC-0(M*N)+0(M+N)
//TABULATION
class Solution {
    public int minDistance(String word1, String word2) {
        int[][] dp=new int[word1.length()][word2.length()];
        
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        
        return helper(word1.length()-1,word1,word2.length()-1,word2,dp);
    }
    public int helper(int i,String word1,int j,String word2,int[][] dp){
        if(i<0) return j+1;//if word1 is finish we have to insert all chars in word2
        if(j<0) return i+1;//for deleting all left in word1 as our word is formed
        
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(word1.charAt(i)==word2.charAt(j)){
            return dp[i][j]=0+helper(i-1,word1,j-1,word2,dp);
        }else{
            return dp[i][j]=(int)1+Math.min(helper(i,word1,j-1,word2,dp),Math.min(helper(i-1,word1,j,word2,dp),helper(i-1,word1,j-1,word2,dp)));//1 st is insert 2 nd is delete 3rd is replace
        }            
    }
}