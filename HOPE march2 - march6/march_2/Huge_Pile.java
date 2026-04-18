import java.util.*;

public class Huge_Pile{
    static int ans = 10000000;
    static boolean found = false;
    public static void rec(int n, int t, int count)
    {
        if(n==t)
        {
        	found = true;
            ans = Math.min(ans,count);
            return ;
        }
        if(n<t)
        {
            return ;
        }
        if(n%2 == 0)
        {
            rec(n/2,t,count+1);
        }
        else
        {
            rec(n/2,t,count+1);
            rec((n/2)+1,t,count+1);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0)
        {
            int n=sc.nextInt();
	        int target = sc.nextInt();
	        rec(n,target,0);
	        if(found) System.out.println(ans);
	        else System.out.println("-1");
	        ans = 100000000;
	        found = false;
	    }
    }
}