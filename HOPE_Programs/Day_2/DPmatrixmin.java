package Day_2;
import java.util.*;

public class DPmatrixmin {
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

        for(int j=0;j<c;j++){
            dp[0][j] = mat[0][j];
        }

        for(int i=1;i<r;i++){
            for(int j=0;j<c;j++){

                int prevmin = Integer.MAX_VALUE;

                for(int k=0;k<c;k++){
                    if(k != j){
                        prevmin = Math.min(prevmin,dp[i-1][k]);
                    }
                }
                dp[i][j] = mat[i][j] + prevmin;
            }
        }

        int min_val = Integer.MAX_VALUE;
        for(int j=0;j<c;j++){
            min_val = Math.min(min_val,dp[r-1][j]);
        }
        System.out.println("MIN VALUE: " + min_val);
    }
}
