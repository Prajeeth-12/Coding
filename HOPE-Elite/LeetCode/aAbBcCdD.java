import java.lang.*;
import java.util.*;

class aAbBcCdD
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
    		HashMap<Character,Integer> map = new HashMap<>();
    		int n = sc.nextInt();
            sc.nextLine();
    		String s = sc.nextLine();
    		s = s.toLowerCase();
    		for(int i=0;i<n;i++){
    		    if(map.containsKey(s.charAt(i))){
    		        map.put(s.charAt(i),map.get(s.charAt(i))+1);
    		    }
    		    else{
    		        map.put(s.charAt(i),1);
    		    }
    		}
    		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    		for(int ele : map.values()){
    		    maxHeap.add(ele);
    		}
            int first = maxHeap.poll();
            int second = maxHeap.isEmpty() ? 0 : maxHeap.poll();
            System.out.println(first + second);

        }
	}
}
