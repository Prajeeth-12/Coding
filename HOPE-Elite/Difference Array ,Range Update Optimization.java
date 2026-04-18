import java.util.*;

public class Main {
    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int[] arr = new int[N+1];
    	for(int i=1 ; i<=N ; i++)
    	{
    		arr[i]=sc.nextInt();
    	}
    	int q = sc.nextInt();
    	int[][] q_arr = new int[q][3];
    	int index=0;
    	while(index < q)
    	{
    		q_arr[index][0] = sc.nextInt();
    		q_arr[index][1] = sc.nextInt();
    		q_arr[index][2] = sc.nextInt();
    		index++;
    	}
    	
    	int[] dp = new int[N+2];
    	for(int idx=0 ; idx<q ; idx++)
    	{
    		int l = q_arr[idx][0];
    		int r = q_arr[idx][1];
    		int val = q_arr[idx][2];
    		dp[l] += val;
    		dp[r+1] += -val;
    	}
    	for(int i=1 ; i<=N ; i++)
    	{
    		dp[i] += dp[i-1];
    	}
    	for(int idx=1 ; idx<=N ; idx++)
    	{
    		dp[idx]+=arr[idx];
    		System.out.print(dp[idx]+" ");
    	}
    }
}