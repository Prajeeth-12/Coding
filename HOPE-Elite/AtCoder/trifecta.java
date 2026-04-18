import java.util.*;

public class trifecta{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<Integer,Integer> map = new TreeMap<>();
        int N = sc.nextInt();
        for(int i=0;i<N;i++){
            int horse = sc.nextInt();
            map.put(horse,i);
        }
        int winners[] = new int[3];
        for(int i=0;i<3;i++){
            winners[i] = map.get(map.firstKey());
            map.remove(map.firstKey());
        }
        for(int i : winners){
            System.out.print((i+1) + " ");
        }
    }
}