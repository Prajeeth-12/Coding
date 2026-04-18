import java.util.*;

public class stripedHorse {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while(t-- > 0){
            long n = sc.nextLong();
            long w = sc.nextLong();
            long[] c = new long[(int)n];
            for(int i=0;i<n;i++){
                c[i] = sc.nextLong();
            }
            long x = 0;
            long fin_min = Integer.MAX_VALUE;
            while(x<w*2){
                long curr_min = 0L;
                for(int i=0;i<n;i++){
                    if(((i+x)%(2*w)) < w){
                        curr_min += c[i];
                    }
                }
                if(fin_min > curr_min){
                    fin_min = curr_min;
                }
                x++;
            }
            System.out.println(fin_min);
        }
    }
}
