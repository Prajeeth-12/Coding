import java.util.*;

public class Main {
	
	private static void dfs(int[] arr , int idx,ArrayList<Integer> curr_arr)
	{
		if(idx==arr.length)
		{
			System.out.println(curr_arr.toString());
			return;
		}
		dfs(arr,idx+1,curr_arr);
		curr_arr.add(arr[idx]);
		dfs(arr,idx+1,curr_arr);
		curr_arr.remove(curr_arr.size()-1);
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0 ; i<N ; i++)
        {
        	arr[i] = sc.nextInt();
        }
        ArrayList<Integer> lst = new ArrayList<>();
        dfs(arr,0,lst);
    }
}