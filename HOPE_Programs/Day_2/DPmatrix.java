package Day_2;
import java.util.*;

public class DPmatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int mat[][] = new int[r][c];
        int dp[][] = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<c;i++){
            dp[0][i] = mat[0][i];
        }
        
        for(int i=1;i<r;i++){
            for(int j=0;j<c;j++){

                int prevmax = Integer.MIN_VALUE;

                for(int k=0;k<c;k++){
                    if(k != j){
                        prevmax = Math.max(prevmax,dp[i-1][k]);
                    }
                }

                dp[i][j] = mat[i][j] + prevmax;
            }
        }

        int max_sum = Integer.MIN_VALUE;
        for(int i=0;i<c;i++){
            max_sum = Math.max(max_sum,dp[r-1][i]);
        }
        System.out.print("MAX VALUE: " + max_sum);
    }
}
