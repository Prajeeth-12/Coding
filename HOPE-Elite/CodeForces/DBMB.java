import java.util.*;

public class DBMB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int s = sc.nextInt();
            int x = sc.nextInt();
            int f = 0;
            int sum = 0;
            for(int i=0;i<n;i++){
                sum += sc.nextInt();
            }
            while(sum <= s){
                if(sum == s){
                    System.out.println("Yes");
                    f = 1;
                    break;
                }
                sum += x;
            }
            if(f == 0) System.out.println("No");
        }

    }
}
