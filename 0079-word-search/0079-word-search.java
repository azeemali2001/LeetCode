class Solution {
    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j] == word.charAt(0)){
                    boolean res = explore(board,i,j,0,word);
                    if(res)
                        return true;
                }
            }
        }
        return false;
    }
    
    static int[] di = {-1,0,1,0};
    static int[] dj = {0,-1,0,1};
    
    
    public static boolean explore(char[][] board,int i,int j, int idx,String str){
        if(idx == str.length())return true;
        if(i<0 || j<0 || i>=board.length || j>=board[0].length) return false;
        
        if(board[i][j] != str.charAt(idx)) return false;
        
        char temp = board[i][j];
        board[i][j] = '`';
        for(int d=0;d<4;d++){
            boolean res = explore(board,i+di[d],j+dj[d],idx+1,str);
            if(res){
                board[i][j] = temp;
                return true;
            }
        }
        board[i][j] = temp;
        return false;
    }
}