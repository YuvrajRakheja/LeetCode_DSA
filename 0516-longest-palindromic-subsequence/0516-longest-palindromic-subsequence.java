//TC-0(M*N)+0(N)FOR REVERSING
//SC-0(M*N)+0(M) A.STACK SPACE
//SPACE OPTIMIZED
public class Solution {
    public int longestPalindromeSubseq(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            sb.append(s.charAt(i));
        }//sb is reversed s
        
        return lcs(s,sb.toString());
    }
    public int lcs(String s1,String s2){
        int[] prev=new int[s2.length()+1];
        int[] curr=new int[s2.length()+1];
        
        for(int j=0;j<s2.length();j++){
            prev[j]=0;    
        }//negative base case of recurssion
        
        for(int i=1;i<=s1.length();i++){
            for(int j=1;j<=s2.length();j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    curr[j]=1+prev[j-1];
                }else{
                    curr[j]=Math.max(prev[j],curr[j-1]);
                }
            }
            prev=curr;
            curr=new int[s2.length()+1];
        }
        return prev[s2.length()];
    }
}
