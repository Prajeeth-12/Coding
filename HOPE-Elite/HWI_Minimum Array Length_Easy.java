import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0 ; i<N ; i++)
        {
        	arr.add(sc.nextInt());
        }
        int idx=0;
        while(idx < arr.size()-1)
        {
        	if(arr.get(idx)%2==0 && arr.get(idx+1)%2==0)
        	{
        		int sum = arr.get(idx) + arr.get(idx+1);
        		arr.remove(idx+1);
        		arr.set(idx,sum);
        		idx=0;
        	}
        	else if(arr.get(idx)%2==1 && arr.get(idx+1)%2==1)
        	{
        		int sum = arr.get(idx) + arr.get(idx+1);
        		arr.remove(idx+1);
        		arr.set(idx,sum);
        		idx=0;
        	}
        	else idx++;
        	//System.out.println(arr.toString());
        }
        System.out.println(arr.size());
    }
}