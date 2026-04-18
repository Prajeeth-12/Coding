import java.util.*;

public class reindeer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long remwt = 0;
            long totpull = 0;
            long tup[][] = new long[n][3];
            for(int i=0;i<n;i++){
                long wt,pull,wtpull;
                wt = sc.nextLong();
                pull = sc.nextLong();
                wtpull = wt + pull;
                remwt += wt;
                tup[i] = new long[] {wtpull,wt,pull};
            }
            int res = n;
            Arrays.sort(tup,Comparator.comparingLong(a -> a[0]));
            for(int i=0;i<n/2;i++){
                long tmp[] = tup[i];
                tup[i] = tup[tup.length - i - 1];
                tup[tup.length - i - 1] = tmp;
            }
            /*for(int i=0;i<n;i++){
                System.out.println(tup[i][0] + " " + tup[i][1] + " " + tup[i][2]);
            }*/
            int i = 0;
            while(remwt > totpull){
                totpull += tup[i][2];
                remwt -= tup[i][1];
                i++;
                res--;
            }
            System.out.println(res);
        }
    }
}
