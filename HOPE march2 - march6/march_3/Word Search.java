class Word_Search {

    private static boolean search(char[][] board, String word,int row, int col,int index)
    {
        if(index == word.length()-1)
        {
            return true;
        }
        
        char stored = board[row][col];
        board[row][col] = '*';
        int[] dx={1,-1,0,0};
        int[] dy = {0,0,1,-1};
        for(int i=0 ; i<4 ; i++)
        {
            int adjX = row + dx[i];
            int adjY = col + dy[i];
            if(adjX <0 || adjY < 0 || adjX>=board.length || adjY>=board[0].length)
            {
                continue;
            }
            else
            {
                if(board[adjX][adjY] == word.charAt(index+1))
                {
                    if(search(board,word,adjX,adjY,index+1)) return true;
                    
                }
            }
        }
        board[row][col] = stored;
        return false;
    }

    public static boolean exist(char[][] board, String word) {
        
        int R = board.length;
        int C = board[0].length;
        for(int i=0 ; i<R ; i++)
        {
            for(int j=0 ; j<C ; j++)
            {
                if(board[i][j] == word.charAt(0))
                {
                    if(search(board,word,i,j,0)) return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "ABCCED";
        System.out.println(exist(board,word));
    }
}