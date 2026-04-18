import java.util.*;

public class Main {
	
	private static boolean dfs(int[] arr,int target,int sum,int index)
	{
		if(sum==target)
		{
			return true;
		}
		if(sum>target) return false;
		if(index==arr.length) return false;
		return dfs(arr,target,sum,index+1) ||  dfs(arr,target,sum+arr[index],index+1);
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0 ; i<N ; i++)
        {
        	arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        if(dfs(arr,target,0,0))
        {
        	System.out.println("YES");
        }
        else
        {
        	System.out.println("NO");
        }
        
    }
}