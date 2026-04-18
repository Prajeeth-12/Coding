import java.util.*;

public class medianFinderHeap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) arr[i] = sc.nextInt();

        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());

        for(int i = 0; i < N; i++){
            minheap.offer(arr[i]);
            while(maxheap.size() > minheap.size()){
                minheap.add(maxheap.poll());
            }
            if(maxheap.size() < minheap.size()){
                maxheap.offer(minheap.poll());
            }
        }
        System.out.print((maxheap.size() > minheap.size()) ? maxheap.poll() : (maxheap.poll() + minheap.poll()) / 2.0f);

    }
    
}