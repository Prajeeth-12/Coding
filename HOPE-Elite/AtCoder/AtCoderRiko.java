import java.io.*;
import java.util.*;

public class AtCoderRiko {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        long totSum = 0;
        long m = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            totSum += a[i];
            
            if (a[i] > m) {
                m = a[i];
            }
        }
        Arrays.sort(a);
        List<Long> divisors = new ArrayList<>();
        for (long i = 1; i * i <= totSum; i++) {
            
            if (totSum % i == 0) {
                
                if (i >= m) {
                    divisors.add(i);
                }
                long other = totSum / i;
                
                if (other >= m && other != i) {
                    divisors.add(other);
                }
            }
        }
        Collections.sort(divisors);
        List<Long> results = new ArrayList<>();
        for (long l : divisors) {
            if (check(a, l)) {
                results.add(l);
            }
        }
        for (int i = 0; i < results.size(); i++) {
            System.out.print(results.get(i) + (i == results.size() - 1 ? "" : " "));
        }
    }

    private static boolean check(long[] a, long l) {
        int left = 0;
        int right = a.length - 1;

        while (right >= 0 && a[right] == l) {
            right--;
        }

        while (left <= right) {
            if (left == right) {
                return false;
            }
            if (a[left] + a[right] == l) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }
}