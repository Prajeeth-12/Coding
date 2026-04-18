class Sudoku_Solver{
    public void solveSudoku(char[][] board) {
        
        solve(board);
    }
    private static boolean solve(char[][] board)
    {
        int R = board.length;
        int C = board[0].length;
        for(int r=0 ; r < R ; r++) {
            for(int c=0 ; c<C ; c++) {
                if(board[r][c] == '.') {
                    for(char ch = '1' ; ch<='9' ; ch++) {
                        
                        if(isValid(r,c,board,ch)) {
                            board[r][c] = ch;
                            if(solve(board))  return true; 
                            board[r][c] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isValid(int r, int c,char[][] board, char ch)
    {
        for(int i=0; i<9 ; i++) {
            if(board[r][i] == ch) return false;
            if(board[i][c] == ch) return false;
            if(board[(r/3)*3 + i/3][(c/3)*3 + i%3] == ch) return false;
        }
        return true;
    }
    public static void main(String[] args){
        char[][] board = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };
        System.out.println(solve(board));
    }
}