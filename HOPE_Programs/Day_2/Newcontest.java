package Day_2;
import java.util.*;

public class Newcontest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int f = sc.nextInt();
        int ans = ((f-d)%7 + 7)%7;
        if(ans == 0) ans = 7;

        System.out.print(ans);


    }
}
