import java.util.*;

public class Main {
    
    static long[][] nCr = new long[65][65];

    static void precompute() {
        for (int i = 0; i <= 64; i++)
        {
            nCr[i][0] = 1;
            for (int j = 1; j <= i; j++)
            {
                nCr[i][j] = nCr[i - 1][j - 1] + nCr[i - 1][j];
            }
        }
    }
    static long countWithSetBits(long limit, int targetBits) {
        if (targetBits < 0 || targetBits > 64) return 0;
        long count = 0;
        int currentSetBits = 0;

        for (int i = 62; i >= 0; i--)
        {
            if ((limit & (1L << i)) != 0)
            {
                int remainingBits = targetBits - currentSetBits;
                if (remainingBits >= 0 && remainingBits <= i) {
                    count += nCr[i][remainingBits];
                }
                currentSetBits++;
            }
        }
        if (currentSetBits == targetBits) count++;
        return count;
    }

    public static void main(String[] args)
    {
        precompute();
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while (t-- > 0)
        {
            long n = sc.nextLong();
            int k = sc.nextInt();
            long totalCount = 0;
            for (int i = 0; i <= 62; i++)
            {
                long lowerBoundForMSB = (1L << i);
                long upperBoundForMSB = Math.min(n, (1L << (i + 1)) - 1);

                if (lowerBoundForMSB > n) break;

                for (int j = 1; j <= i + 1; j++)
                {
                    if ((i + 1) + j - 1 > k)
                    {
                        totalCount += countWithSetBits(upperBoundForMSB, j) 
                                     - countWithSetBits(lowerBoundForMSB - 1, j);
                    }
                }
            }
            System.out.println(totalCount);
        }
    }
}