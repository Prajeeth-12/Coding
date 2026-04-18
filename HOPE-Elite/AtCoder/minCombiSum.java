import java.util.*;

public class minCombiSum {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int num = sc.nextInt();
            minHeap.add(num);
        }
        
        int cost = 0;

        while(minHeap.size() > 1){
            int combi = minHeap.poll() + minHeap.poll();
            cost += combi;
            minHeap.add(combi);
        }
        System.out.println("Min: " + cost);
    }
}
