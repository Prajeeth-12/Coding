import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] p = new int[n];
            for (int i = 0; i < n; i++) p[i] = sc.nextInt();

            int[] d = new int[n - 1];
            List<Integer>[] buckets = new ArrayList[n + 1];
            for (int i = 0; i <= n; i++) buckets[i] = new ArrayList<>();
            
            for (int i = 0; i < n - 1; i++) {
                d[i] = Math.abs(p[i] - p[i+1]);
                buckets[d[i]].add(i);
            }

            long currentAns = (long) n * (n - 1) / 2;
            long[] answers = new long[n];
            
            TreeSet<Integer> zeros = new TreeSet<>();
            zeros.add(-1);
            zeros.add(n - 1);

            for (int k = 1; k < n; k++) {
                answers[k] = currentAns;
                for (int pos : buckets[k]) {
                    int prev = zeros.lower(pos);
                    int next = zeros.higher(pos);
                    
                    long len = next - prev - 1;
                    currentAns -= len * (len + 1) / 2;
                    
                    long leftLen = pos - prev - 1;
                    long rightLen = next - pos - 1;
                    currentAns += leftLen * (leftLen + 1) / 2;
                    currentAns += rightLen * (rightLen + 1) / 2;
                    
                    zeros.add(pos);
                }
            }
            
            StringBuilder sb = new StringBuilder();
            for (int k = 1; k < n; k++) {
                sb.append(answers[k]).append(k == n - 1 ? "" : " ");
            }
            System.out.println(sb.toString());
        }
    }
}