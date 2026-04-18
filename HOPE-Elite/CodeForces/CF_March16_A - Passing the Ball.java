import java.util.*;

public class Main {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-- > 0)
		{
			int N = sc.nextInt();
			sc.nextLine();
			String str = sc.nextLine();
			int count = 0;
			boolean[] visited = new boolean[N];
			for(int idx=0 ; idx<N ; idx++)
			{
				if(str.charAt(idx)=='R')
				{
					count++;
					visited[idx]=true;
				}
				else
				{
					if(visited[idx-1]==false)
					{
						count++;
					}
					break;
				}
			}
			System.out.println(count+1);
		}
	}
}