package Day_2;
import java.util.*;

public class DPmatrixCol {
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

        for(int i=0;i<r;i++){
            dp[i][0] = mat[i][0];
        }

        for(int j=1;j<c;j++){
            for(int i=0;i<r;i++){

                int prevmax = Integer.MIN_VALUE;

                for(int k=0;k<r;k++){
                    if(k != i){
                        prevmax = Math.max(prevmax,dp[k][j-1]);
                    }
                }
                dp[i][j] = mat[i][j] + prevmax;
            }
        }

        int max_val = Integer.MIN_VALUE;

        for(int i=0;i<r;i++){
            max_val = Math.max(max_val,dp[i][c-1]);
        }
        System.out.println("MAX VAL: " + max_val);
    }
}
