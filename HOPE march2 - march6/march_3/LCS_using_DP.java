import java.util.*;

public class LCS_using_DP {
    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	String s1 = sc.nextLine();
    	String s2 = sc.nextLine();
    	int R = s1.length();
    	int C = s2.length();
    	int[][] arr = new int[R][C];
    	int max_len = 0;
    	for(int r=0 ; r<R ; r++)
    	{
    		for(int c=0 ; c<C ; c++)
    		{
    			if(s1.charAt(r) == s2.charAt(c))
    			{
    				if(r>0 && c>0)
    				{
    					arr[r][c] = arr[r-1][c-1] + 1;
    					max_len = Math.max(max_len,arr[r][c]);
    				} else
    				{
    					arr[r][c]=1;
    				}
    			}
    		}
    	}
    	System.out.println(max_len);
    }
}