import java.util.*;

public class Heapify {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                arr[i] = sc.nextInt();
            }
            boolean flag = true;
            boolean[] visited = new boolean[n + 1];
            for (int i = 1; i <= n; i++) {
                if (!visited[i]) {
                    List<Integer> idx = new ArrayList<>();
                    List<Integer> values = new ArrayList<>();
                    int curr = i;
                    while (curr <= n) {
                        visited[curr] = true;
                        idx.add(curr);
                        values.add(arr[curr]);
                        if (curr > n / 2) break;
                        curr *= 2;
                    }
                    Collections.sort(idx);
                    Collections.sort(values);

                    if (!idx.equals(values)) {
                        flag = false;
                        break;
                    }
                }
            }
            if(flag){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}