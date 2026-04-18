/*
1. Check if a subsequence with given sum exists 
Question: 
	Given an array of size n and a target T,
	print "YES" if there exists at least one subsequence whose sum is equal to T.
	Otherwise, print "NO". 
	
Example: 
Input: 
	n = 4 
	arr = [1, 2, 3, 4] 
	T = 5 
Output: YES 

Explanation: The subsequence [1, 4] has sum = 5.

*/

import java.util.*;

public class Main{
	
	static int T;
	
	private static boolean dfs(int sum, int index, int arr[])
	{
		if(sum == T)
		{
			return true;
		}
		if(index == arr.length)
		{
			//System.out.println("HERE"+" "+sum+" "+index);
			return false;
		}
		
		return dfs(sum+arr[index], index+1, arr) || dfs(sum, index+1, arr);
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0 ; i<N ; i++) arr[i]=sc.nextInt();
		T = sc.nextInt();
		if(dfs(0,0,arr))
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}
}