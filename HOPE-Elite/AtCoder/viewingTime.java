import java.util.Scanner;

public class viewingTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long t = sc.nextLong();
        long clsTime = 0;
        long opnTime = 0;
        for (int i = 0; i < n; i++) {
            long look = sc.nextLong();
            if (look >= opnTime) {
                long reopenAt = Math.min(look + 100, t);
                clsTime += (reopenAt - look);
                opnTime = reopenAt;
            }
        }
        System.out.println(t - clsTime);
    }
}