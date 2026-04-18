import java.util.*;

public class hackwithinfyFood {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int v[] = new int[N];
        int d[] = new int[N];
        for(int i=0;i<N;i++){
            v[i] = sc.nextInt();
        }
        for(int i=0;i<N;i++){
            d[i] = sc.nextInt();
        }
        int ti = 1;
        int maxTaste = 0;
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        while(ti<=M){
            for(int i=0;i<N;i++){
                heap.offer(v[i]-(d[i]*(ti-1)));
            }
            ti++;
            maxTaste += heap.poll();
        }
        System.out.println(maxTaste);
    }
}
