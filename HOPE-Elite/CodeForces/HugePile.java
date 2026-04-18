import java.util.*;

public class HugePile {
    static long flag = 0;
    static int flag2 = 0;
    static long steps = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while(t-- > 0){
            flag = 0;
            flag2 = 0;
            steps = 0;
        long n = sc.nextLong();
        long target = sc.nextLong();
        helper(n, target,steps);
        if(flag2 == 1) System.out.println(flag);
        else System.out.println(-1);}
    }
    public static void helper(long n,long target,long steps){
        if(n == target){
            flag = steps;
            flag2 = 1;
            return;
        }
        if(n < target){
            return;
        }
        if(n%2 == 0){
            helper(n/2, target,steps+1);
        }
        if(n%2 != 0){
            helper((n/2)+1, target,steps+1);
            helper(n/2, target,steps+1);
        }
    }
}
