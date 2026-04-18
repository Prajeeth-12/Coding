

public class island {
    public static void main(String[] args) {
        int mat[][] = {{5,2,0,1,5,3},{10,1,0,6,7,5},{4,3,2,0,6,7},{0,0,1,0,2,3}};
        int r = mat.length;
        int c = mat[0].length;
        //int[][] DIRS = {{1,0},{0,1},{0,-1},{-1,0}};
        int islands = 0;

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(mat[i][j] != 0){
                    dfs(mat,i,j);
                    islands++;
                }
            }
        }
        System.out.println("Islands: " + islands);
    }

    public static void dfs(int[][] mat,int i, int j){
        if(i<0 || j<0 || i>=mat.length || j>=mat[0].length || mat[i][j] == 0) return;

        mat[i][j] = 0;
        dfs(mat,i,j+1);
        dfs(mat,i,j-1);
        dfs(mat,i+1,j);
        dfs(mat,i-1,j);
    }
}
