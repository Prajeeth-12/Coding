import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int N = sc.nextInt();
        int Q = sc.nextInt();
        
        long[] A = new long[N];
        for (int i = 0; i < N; i++)
        {
            A[i] = sc.nextLong();
        }
        Arrays.sort(A);

        long[] missingCount = new long[N];
        for (int i = 0; i < N; i++)
        {
            missingCount[i] = A[i] - (i + 1);
        }
        while (Q-- > 0)
        {
            long X = sc.nextLong();
            long Y = sc.nextLong();

            int countBeforeX = lowerBound(A, X);
            long missingBeforeX = (X - 1) - countBeforeX;
            long totalMissingNeeded = missingBeforeX + Y;
            int pos = lowerBound(missingCount, totalMissingNeeded);
            if (pos == 0)
            {
                System.out.println(totalMissingNeeded);
            } else
            {
                long result = A[pos - 1] + (totalMissingNeeded - missingCount[pos - 1]);
                System.out.println(result);
            }
        }
    }

    static int lowerBound(long[] arr, long key) {
        int low = 0, high = arr.length;
        while (low < high)
        {
            int mid = low + (high - low) / 2;
            if (arr[mid] < key) low = mid + 1;
            else high = mid;
        }
        return low;
    }
}