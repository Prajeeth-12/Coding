import java.util.*;

public class revPermu {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] p = new int[n];

            for (int i = 0; i < n; i++) {
                p[i] = sc.nextInt();
            }
            int l = -1;
            int target = -1;

            for (int i = 0; i < n; i++) {
                if (p[i] != n - i) {
                    l = i;
                    target = n - i;
                    break;
                }
            }
            if (l != -1) {
                int r = -1;
                for (int i = l + 1; i < n; i++) {
                    if (p[i] == target) {
                        r = i;
                        break;
                    }
                }
                reverse(p, l, r);
            }
            
            for (int i = 0; i < n; i++) {
                System.out.print(p[i] + (i == n - 1 ? "" : " "));
            }
            System.out.println();
        }
    }
    public static void reverse(int[] a, int l, int r) {
        while (l < r) {
            int tmp = a[l];
            a[l] = a[r];
            a[r] = tmp;
            l++;
            r--;
        }
    }
}