import java.util.*;

public class MinOp1 {
    static int flag = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        helper(n, target);
        if(flag == 1) System.out.println("YES!");
        else if(flag == 0) System.out.println("NO!");
    }
    public static void helper(int n,int target){
        if(n == target){
            flag = 1;
            return;
        }
        if(n < target){
            return;
        }
        if(n%2 == 0){
            helper(n/2, target);
        }
        if(n%2 != 0){
            helper((n/2)+1, target);
            helper(n/2, target);
        }
    }
}
