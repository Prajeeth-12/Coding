import java.util.*;

public class Main{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int X=sc.nextInt();
		int Y=sc.nextInt();
		for(int i=1 ; i<=Y ; i++)
		{
			X = X*2;
		}
		System.out.println(X);
	}
}