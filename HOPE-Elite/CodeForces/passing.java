import java.util.*;

public class passing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            //sc.next();
            String s = sc.next();
            int[] hash = new int[n];
            int cnt = 0;
            int k = 0;
            for(int i=0;i<n;i++){
                if(hash[k] == 0){
                    cnt++;
                    hash[k] = 1;
                }
                if(s.charAt(k) == 'L')
                    k = k-1;
                else
                    k = k+1;
            }
            System.out.println(cnt);
        }
    }
}
