package Day_3;
import java.util.*;

public class DPmatrixcomplex {
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
                int prevmax = Integer.MIN_VALUE;
                for(int k=0;k<c;k++){
                    if(((j==0) && (k!=j || k!=j+1))){
                        prevmax = Math.max(prevmax,dp[i-1][k]);
                    }
                    else if((j==c-1) && (k!=j && k!=j-1)){
                        prevmax = Math.max(prevmax,dp[i-1][k]);
                    }
                    else if(((j>0 && j<c-1) && (k != j && k != j+1 && k != j-1))){
                        prevmax = Math.max(prevmax,dp[i-1][k]);
                    }
                    
                }
                //System.out.println(prevmax);
                dp[i][j] = mat[i][j] + prevmax;
            }
        }
        int max_sum = Integer.MIN_VALUE;
        for(int j=0;j<c;j++){
            max_sum = Math.max(max_sum,dp[r-1][j]);
        }
        System.out.println("Max Sum: " + max_sum);
    }
}
