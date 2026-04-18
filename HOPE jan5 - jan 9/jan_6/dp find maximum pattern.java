import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] dp = new int[r][c];

        // Read first row
        for (int j = 0; j < c; j++) {
            dp[0][j] = sc.nextInt();
        }

        // Process remaining rows
        for (int i = 1; i < r; i++) {

            int firstMax = Integer.MIN_VALUE;
            int secondMax = Integer.MIN_VALUE;
            int firstMaxIdx = -1;

            // Find max and second max from previous row
            for (int j = 0; j < c; j++) {
                if (dp[i - 1][j] > firstMax) {
                    secondMax = firstMax;
                    firstMax = dp[i - 1][j];
                    firstMaxIdx = j;
                } else if (dp[i - 1][j] > secondMax) {
                    secondMax = dp[i - 1][j];
                }
            }

            // Read current row and update dp
            for (int j = 0; j < c; j++) {
                int val = sc.nextInt();
                if (j == firstMaxIdx)
                    dp[i][j] = val + secondMax;
                else
                    dp[i][j] = val + firstMax;
            }
        }

        // Answer = max in last row
        int ans = Integer.MIN_VALUE;
        for (int j = 0; j < c; j++) {
            ans = Math.max(ans, dp[r - 1][j]);
        }

        System.out.println(ans);
    }
}
