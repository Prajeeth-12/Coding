import java.util.*;

public class TravellersProb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int travellers = sc.nextInt();
        int rooms = sc.nextInt();
        int ways = 0;
        int[] room_caps = new int[rooms];
        for (int i = 0; i < rooms; i++) {
            room_caps[i] = sc.nextInt();
        }
        List<List<Integer>> combinations = new ArrayList<>();
        for(int i=1;i<(1<<rooms);i++){
            int s = 0;
            List<Integer> comb = new ArrayList<>();
            for(int j=0;j<rooms;j++){
                if((i & (1<<j)) > 0){
                    s += room_caps[rooms-1-j];
                    comb.add(room_caps[rooms-1-j]);
                }
            }
            if(s == travellers) {
                ways++;
                combinations.add(comb);
            }
        }
        System.out.println("Total no of ways: " + ways);
        System.out.println("Vaild combinations are: " + combinations);
    }
}