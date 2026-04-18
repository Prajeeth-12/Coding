import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            
            if (n == k) {
                System.out.println(0);
                continue;
            }
            
            Queue<long[]> queue = new LinkedList<>();
            Map<Long, Integer> visited = new HashMap<>();
            
            queue.offer(new long[]{n, 0});
            visited.put(n, 0);
            
            int result = -1;
            while (!queue.isEmpty()) {
                long[] curr = queue.poll();
                long val = curr[0];
                int steps = (int)curr[1];
                
                if (val == k) {
                    result = steps;
                    break;
                }
                
                if (val < k) continue;
                
                long next1 = val / 2;
                long next2 = (val % 2 == 1) ? val / 2 + 1 : -1;
                
                if (!visited.containsKey(next1) || visited.get(next1) > steps + 1) {
                    visited.put(next1, steps + 1);
                    queue.offer(new long[]{next1, steps + 1});
                }
                
                if (next2 != -1 && (!visited.containsKey(next2) || visited.get(next2) > steps + 1)) {
                    visited.put(next2, steps + 1);
                    queue.offer(new long[]{next2, steps + 1});
                }
            }
            
            System.out.println(result);
        }
        
        sc.close();
    }
}