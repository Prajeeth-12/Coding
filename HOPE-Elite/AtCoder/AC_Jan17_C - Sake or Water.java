import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        long X = sc.nextLong();
        
        long[] A = new long[N];  
        for (int i = 0; i < N; i++)
        {
            A[i] = sc.nextLong();
        }
        
        Arrays.sort(A);
        for (int i = 0; i < N / 2; i++)
        {
            long temp = A[i];
            A[i] = A[N - 1 - i];
            A[N - 1 - i] = temp;
        }
        
        for (int m = K; m <= N; m++)
        {
            long worstCaseSake = 0;
            for (int i = m - K; i < m; i++)
            {
                worstCaseSake += A[i];
            }
            
            if (worstCaseSake >= X)
            {
                System.out.println(m);
                return;
            }
        }
        
        System.out.println(-1);
    }
}