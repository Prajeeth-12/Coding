package Day_3;
import java.util.*;

public class jersey {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 0;
        n = sc.nextInt();
        int ans = 0;
        for(int i=1;i<=(n+n+1);i++){
            int curr;
            curr = sc.nextInt();
            ans ^= curr;
        }
        System.out.println(ans);
    }
}
