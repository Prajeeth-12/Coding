package Day_3;

public class DFS {
    static int max_nums;
    public static void main(String[] args) {
        int mat[][] = {{5,2,0,1,5,3},{10,1,0,6,7,5},{4,3,2,0,6,7},{0,0,1,0,2,3}};
        int r = mat.length;
        int c = mat[0].length;
        int n_islands = 0;
        for(int i = 0;i<mat.length;i++){
            for(int j = 0;j<mat[0].length;j++){
                if(mat[i][j] != 0){
                    n_islands++;
                    dfs(mat,i,j);
                    System.out.println("Max: " + max_nums);
                    max_nums = 0;
                }
            }
        }
    }

    public static void dfs(int[][] mat, int i, int j){
        if(i<0 || i>=mat.length || j<0 || j>=mat[0].length || mat[i][j] == 0){
            return;
        }
        max_nums = Math.max(max_nums,mat[i][j]);
        mat[i][j] = 0;
        dfs(mat, i+1, j);
        dfs(mat, i-1, j);
        dfs(mat, i, j+1);
        dfs(mat, i, j-1);
    }
}
