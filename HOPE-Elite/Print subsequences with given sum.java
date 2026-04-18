import java.util.*;

public class Main {
	private static void dfs(int[] arr,int target,int sum,int idx,ArrayList<Integer> lst)
	{
		if(sum == target)
		{
			System.out.println(lst.toString());
			return;
		}
		if(sum>target || idx==arr.length) return;
		
		dfs(arr,target,sum,idx+1,lst);
		lst.add(arr[idx]);
		dfs(arr,target,sum+arr[idx],idx+1,lst);
		lst.remove(lst.size()-1);
	
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0 ; i<N ; i++)
        {
        	arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        dfs(arr,target,0,0,new ArrayList<>());
    }
}