import java.util.*;

public class Main {
	
	static int flag=0;
	
	public static void rec(int idx, int arr[], int cur, int target)
	{
		if(flag==1) return ;
		if(cur == target) 
		{
			System.out.println("Yes");
			flag=1;
			return ;
		}
		if(cur > target) 
		{
			return ;
		}
		if(idx >= arr.length) return ;
		
		rec(idx+1,arr,cur+arr[idx],target);
		rec(idx+1,arr,cur,target);
		
	} 
    
    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int arr[] = new int[n];
    	for(int i=0 ; i<n ; i++)
    	{
    		arr[i]=sc.nextInt();
    	}
    	int tar = sc.nextInt();
    	rec(0,arr,0,tar);
    	if(flag==0) System.out.println("No");
    }
}