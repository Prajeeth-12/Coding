import java.util.*;

public class Main{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-- > 0)
		{
			long X = sc.nextInt();
			if(X%9 != 0)
			{
				System.out.println(0);
			}
			else
			{
				if(exist(X))
				{
					System.out.println(10);
				}
				else
				{
					System.out.println(0);
				}
			}
		}
	}
	
	public static boolean exist(long X)
	{
		for(long y = X ; y<= X+200 ; y++)
		{
			if(y - sum_of_digits(y) == X)
			{
				return true;
			}
		}
		return false;
	}
	
	public static long sum_of_digits(long n)
	{
		long sum = 0;
		while(n > 0)
		{
			sum += n%10;
			n = n/10;
		}
		return sum;
	}
}