import java.util.*;

public class ForbiddenList2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        HashSet<Long> hashset = new HashSet<>();
        int Q = sc.nextInt();
        for(int i=0;i<N;i++){
            long val = sc.nextLong();
            hashset.add(val);
        }
        for(int i=0;i<Q;i++){
            long x = sc.nextLong();
            long y = sc.nextLong();
            while(y > 0){
                if(hashset.contains(x)){
                    x++;
                    continue;
                }
                //System.out.print(x + " ");
                x++;
                y--;
            }
            System.out.println(--x);
        }
    }
}
