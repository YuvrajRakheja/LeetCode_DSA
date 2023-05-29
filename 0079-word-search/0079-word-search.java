//TC-0(M*N)
//SC-0(H) AUXILLIARY STACK SPACE OF RECURSSION
//https://www.youtube.com/watch?v=TKk1NBMY8As
class Solution {
    public boolean exist(char[][] board, String word) {
        int n=board.length;
        int m=board[0].length;
        int idx=0;
        boolean ans=false;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(search(idx,i,j,board,word)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean search(int index,int i,int j,char[][] board,String word){
        if(index==word.length()){
            return true;
        }
        if(i<0 || j<0 || i>=board.length || j>=board[0].length){//base case
            return false;
        }
        boolean ans=false;

        if(word.charAt(index) == board[i][j]){
            board[i][j]='$';//any character so that it does not go back
            
            ans=search(index+1,i+1,j,board,word)|| //for bottom
                search(index+1,i,j+1,board,word)|| //for right
                search(index+1,i-1,j,board,word)|| //for top
                search(index+1,i,j-1,board,word); //for left
            
            board[i][j]=word.charAt(index);            
        }
        return ans;
    }
}