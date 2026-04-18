  import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int W = sc.nextInt();
            int mod = 2 * W;

            long[] bucketSums = new long[mod];
            for (int i = 1; i <= N; i++)
            {
                bucketSums[i%mod] += sc.nextLong();
            }

            long currentSum = 0;
            for (int i = 0; i < W; i++)
            {
                currentSum += bucketSums[i];
            }

            long minCost = currentSum;
            for (int i = 0; i < mod; i++) {
                currentSum = currentSum - bucketSums[i] + bucketSums[(i + W) % mod];
                if (currentSum < minCost) {
                    minCost = currentSum;
                }
            }
            System.out.println(minCost);
        }
    }
}