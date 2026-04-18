import java.util.*;

public class prefixSum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int n = sc.nextInt();
            int max=0,sum=0;
            for(int i=0;i<n;i++){
                int x = sc.nextInt();
                max = Math.max(max,x);
                //sum += max;
            }
            System.out.println(max*n);
        }
    }
}