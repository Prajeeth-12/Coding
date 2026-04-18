import java.util.*;

public class NQueens{
    static int prev = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int board[][] = new int[N][N];
        boolean rf[] = new boolean[N];
        boolean cf[] = new boolean[N];
        boolean df1[] = new boolean[2*N];
        boolean df2[] = new boolean[2*N];
        int row = 0;
        int col = 0;
        while(row<N){
            int flag = 0;
            col = prev;
            if(row == 0){
                while(col<N){
                    if(isSafe(board,rf,cf,df1,df2,N,row,col)){
                    flag = 1;
                    placeQ(board, rf, cf, df1, df2, N, row, col);
                    }
                    col++;
                }
            }
            else{
                col = 0;
                while(col<N){
                    if(isSafe(board,rf,cf,df1,df2,N,row,col)){
                        flag = 1;
                        placeQ(board, rf, cf, df1, df2, N, row, col);
                    }
                    col++;
                }
            }
            row++;
            if(flag == 0){
        
                Arrays.fill(rf,false);
                Arrays.fill(cf,false);
                Arrays.fill(df1,false);
                Arrays.fill(df2,false);
                for(int i=0;i<N;i++){
                    Arrays.fill(board[i],0);
                }
                prev++;
                row = 0;
                col = prev;
            }
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    
    }

    private static boolean isSafe(int board[][],boolean rf[], boolean cf[], boolean df1[], boolean df2[], int N, int row, int col){
        int d1 = row+col;
        int d2 = (N-1) - row + col;
        if(rf[row] == true) return false;
        if(cf[col] == true) return false;
        if(df1[d1] == true) return false;
        if(df2[d2] == true) return false;
        return true;
    }

    private static void placeQ(int board[][], boolean rf[], boolean cf[], boolean df1[], boolean df2[], int N, int row, int col){
        int d1 = row+col;
        int d2 = (N-1) - row + col;
        board[row][col] = 1;
        rf[row] = true;
        cf[col] = true;
        df1[d1] = true;
        df2[d2] = true;
    }
}