import java.util.*;
public class Main{
    public static void main(String[]arg)
    {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        while(t-- >0)
        {
            int n=scan.nextInt();
            long arr[]=new long[n+2];
            long health=scan.nextLong();
            long k=scan.nextLong();
            long sum=0;
            for(int i=1;i<=n;i++)
            {
                arr[i]=scan.nextLong();
                sum+=arr[i];
            }
            long prefix[]=new long[n+1];
            for(int i=1;i<=n;i++)
            {
                prefix[i]=prefix[i-1]+arr[i];
            }
            long minprefix[]=new long[n+1];
            minprefix[0]=Long.MAX_VALUE;
            long maxsuffix[]=new long[n+2];
            for(int i=1;i<=n;i++)
            {
                minprefix[i]=Math.min(minprefix[i-1],arr[i]);
            }
            for(int i=n;i>=1;i--)
            {
                maxsuffix[i]=Math.max(maxsuffix[i+1],arr[i]);
            }
            long complete=(health-1)/sum;
            long remHealth=health - (complete*sum);
            for(int i=1;i<=n;i++)
            {
                long gain=Math.max(0L,maxsuffix[i+1]-minprefix[i]);
                long temp=gain+prefix[i];
                if(temp>=remHealth)
                {
                    System.out.println(complete*(n+k) +i);
                    break;
                }
            }
        }
    }
}