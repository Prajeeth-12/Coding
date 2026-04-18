import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] degree = new int[n + 1];
            
            for (int i = 0; i < n - 1; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int u = Integer.parseInt(st.nextToken());
                int v = Integer.parseInt(st.nextToken());
                degree[u]++;
                degree[v]++;
            }
            
            int ans = 0;
            for (int i = 2; i <= n; i++) {
                ans = Math.max(ans, degree[i]);
            }
            ans = Math.max(ans, degree[1] + 1);
            
            pw.println(ans);
        }
        
        pw.flush();
        pw.close();
    }
}