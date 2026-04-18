import java.util.*;

public class FriendlyNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextInt();
            long ctr = 0;
            for(long i=n;i<n + 100;i++){
                if((i - sumDigs(i)) == n)
                    ctr++;
            }
            System.out.println(ctr);
        }
    }

    private static long sumDigs(long n){
        long sum = 0;
        while(n>0){
            sum += n%10;
            n /= 10;
        }
        return sum;
    }
}