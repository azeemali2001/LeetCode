class Solution {
    public boolean isValidSudoku(char[][] board) {
        //Checking row
        HashSet<Character> hs = new HashSet<>();
        
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j] != '.') {
                    if(hs.contains(board[i][j])){
                        return false;
                    } else {
                        hs.add(board[i][j]);
                    }
                }
            }
            hs = new HashSet<>();
        }
        
        hs = new HashSet<>();
        
        //Checking Column
        for(int j=0;j<9;j++){
            for(int i=0;i<9;i++){
                if(board[i][j] != '.') {
                    if(hs.contains(board[i][j])) {
                        return false;
                    } else {
                        hs.add(board[i][j]);
                    }
                }
            }
            hs = new HashSet<>();
        }
        
        
        //Checking a grid
        
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j] != '.'){
                    if(! isSolvable(board,i,j))
                        return false;
                }
            }
        }
        return true;
    }
    
    public static boolean isSolvable(char[][]board,int i,int j){
        HashSet<Character> hs = new HashSet<>();
        int si = i/3 * 3;
        int sj = j/3 * 3;
        
        for(int m=0;m<3;m++){
            for(int n=0;n<3;n++){
                if(board[si+m][sj+n] != '.'){
                    if(hs.contains(board[si+m][sj+n])) {
                        return false;
                    } else {
                        hs.add(board[si+m][sj+n]);
                    }
                }
            }
        }
        return true;
    }
    
}