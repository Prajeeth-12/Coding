

import java.util.*;

public class q1{

    static int c=0;
    public static void rec(int n, int t, int count)
    {
        if(n==t)
        {
            c=count;
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
        int n=sc.nextInt();
        int target = sc.nextInt();
        rec(n,target,0);
        System.out.println(c);
    }
}
