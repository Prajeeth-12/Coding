import java.util.*;

public class Main{
	
	public static int f(int a, int b)
	{
		int layers=0;
		int pw=0;
		while(true)
		{
			if(pw%2==0)
			{
				if(a>=(1<<pw)) a-=(1<<pw);
				else break;
			}
			else
			{
				if(b>=(1<<pw)) b-=(1<<pw);
				else break;
			}
			pw++;
			layers++;
		}
		return layers;
	}
	
    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
    	int n=sc.nextInt();
    	for(int i=0 ; i<n ; i++)
    	{
    		int a=sc.nextInt();
    		int b=sc.nextInt();
    		System.out.println(Math.max(f(a,b),f(b,a)));
    	}
    }
}