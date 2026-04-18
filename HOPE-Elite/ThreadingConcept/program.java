import java.util.*;
public class program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        for(int i=1;i<=k;i++){
            Thread t = new Thread(new Worker(n,i));
            t.start();
        }
    }
}