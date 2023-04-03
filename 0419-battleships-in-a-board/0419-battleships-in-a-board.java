//TC-0(N*M)
//SC-0(1)
class Solution {
    public int countBattleships(char[][] board) {
        int count=0;
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='X'){
                    if(i==0 && j==0){
                        count++;//first row first col so new battleship
                    }else if(i==0){//first row
                        if(board[i][j-1]!='X'){//matlab previous col wala(left) . hai so new battle
                            count++;
                        }
                    }else if(j==0){//first col
                        if(board[i-1][j]!='X'){//matlab previous row wala (just above) . hai so new battle
                            count++;
                        }
                    }else{//middle me
                        if(board[i-1][j]!='X' && board[i][j-1]!='X'){
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}