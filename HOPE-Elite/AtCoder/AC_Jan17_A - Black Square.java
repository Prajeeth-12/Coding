import java.util.*;

public class Main{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int P=sc.nextInt();
		int Q=sc.nextInt();
		int X=sc.nextInt();
		int Y=sc.nextInt();
		
		if(P<1 || Q<1 || X<1 || Y<1 || P>10000 || Q>10000 || X>10000 || Y>10000)
		{
			System.out.println("No");
		}
		else
		{
			if(X>=P && X<P+100 && Y>=Q && Y<Q+100)
			{
				System.out.println("Yes");
			}
			else
			{
				System.out.println("No");
			}
		}
	}
}