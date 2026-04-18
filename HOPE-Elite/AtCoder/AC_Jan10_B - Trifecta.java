import java.util.*;

public class Main{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		TreeMap<Integer,Integer> tm = new TreeMap<>();
		for(int i=1 ; i<=N ; i++)
		{
			tm.put(sc.nextInt(),i);
		}
		for(int i=1 ; i<=3 ; i++)
		{
			Map.Entry<Integer,Integer> got = tm.pollFirstEntry();
			System.out.print(got.getValue()+" ");
		}
	}
}