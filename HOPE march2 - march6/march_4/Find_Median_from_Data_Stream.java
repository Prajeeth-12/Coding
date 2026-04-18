import java.util.Collections;
import java.util.PriorityQueue;

class MedianFinder {

    PriorityQueue<Integer> minHeap ;
    PriorityQueue<Integer> maxHeap ;
    
    public MedianFinder() {
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    }
    
    public void addNum(int num) {
        minHeap.add(num);
        if(minHeap.size() > maxHeap.size()+1)
        {
            maxHeap.add(minHeap.poll());
        }
        if(!maxHeap.isEmpty() && maxHeap.peek() > minHeap.peek())
        {
            int temp = minHeap.poll();
            minHeap.add(maxHeap.poll());
            maxHeap.add(temp);
        }
    }
    
    public double findMedian() {
        if(maxHeap.size() == minHeap.size())
        {
            return (maxHeap.peek() + minHeap.peek())/2.0f;
        }
        else return minHeap.peek();
    }
}

class Find_Median_from_Data_Stream {
    public static void main(String[] args) {
        MedianFinder medianFinder = new MedianFinder();
        medianFinder.addNum(1);
        medianFinder.addNum(2);
        System.out.println(medianFinder.findMedian()); // return 1.5 (i.e., (1 + 2) / 2)
        medianFinder.addNum(3); 
        System.out.println(medianFinder.findMedian()); // return 2.0
    }
}