package Day_3;
import java.util.*;

public class BFS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mat[][] = {{1,1,1,1,0},{1,1,0,1,0},{1,1,0,0,0},{0,0,0,0,0}};
        int r = mat.length;
        int c = mat[0].length;
        int n_islands = 0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(mat[i][j] == 1){
                    n_islands++;
                    bfs(mat,i,j);
                }
            }
        }
    }

    public static void bfs(int[][] mat, int i, int j){
        if(i<0 || i<mat.length || j<0 || j<mat[0].length || mat[i][j] != 1){
            return;
        }
        HashSet<Integer> visited = new HashSet<>();
        
    }

}
