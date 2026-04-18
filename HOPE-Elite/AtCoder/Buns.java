import java.util.*;

public class Buns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int buns = n;
        int k = sc.nextInt();
        int years = 0;
        while(buns<k){
            years++;
            buns += n+years;
        }
        System.out.print(years);
    }
}
