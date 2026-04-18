import java.util.Scanner;

public class CString {
    private static long gcd(long x, long y) {
        return y == 0 ? x : gcd(y, x % y);
    }

    private static long lcm(long x, long y) {
        return x / gcd(x, y) * y;
    }

    private static long vis(long m, long x) {
        return m / x;
    }

    private static void solve(Scanner in) {
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long m = in.nextLong();

        long onlyA = vis(m, a);
        long onlyB = vis(m, b);
        long onlyC = vis(m, c);
        long bothAB = vis(m, lcm(a, b));
        long bothAC = vis(m, lcm(a, c));
        long bothBC = vis(m, lcm(b, c));
        long allABC = vis(m, lcm(lcm(a, b), c));

        System.out.print(6 * onlyA - 3 * bothAB - 3 * bothAC + 2 * allABC);
        System.out.print(" ");
        System.out.print(6 * onlyB - 3 * bothAB - 3 * bothBC + 2 * allABC);
        System.out.print(" ");
        System.out.print(6 * onlyC - 3 * bothAC - 3 * bothBC + 2 * allABC);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            solve(in);
        }
        in.close();
    }
}