import java.util.*;

public class TravellersProb2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int r = sc.nextInt();
        int room_caps[] = new int[r];
        
        for(int i=0;i<r;i++){
            room_caps[i] = sc.nextInt();
        }
        List<List<Integer>> combinations = new ArrayList<>();
        int ways = 0;

        for(int i=1;i<(1<<r);i++){
            int s = 0;
            List<Integer> comb = new ArrayList<>();
            for(int j=0;j<r;j++){
                if((i & (1<<j)) > 0){
                    s += room_caps[r-1-j];
                    comb.add(room_caps[r-1-j]);
                }
            }
            if(s > t) {
                ways++;
                combinations.add(comb);
            }
        }
        System.out.println("Total possible ways: " + ways);
        System.out.println("Vaild combinations are: " + combinations);
    }
}
