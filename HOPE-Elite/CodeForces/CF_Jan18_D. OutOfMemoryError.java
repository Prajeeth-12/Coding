import java.util.*;

public class Main{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		while(T-- >0)
		{
			int N=sc.nextInt();
			int M = sc.nextInt();
			int H = sc.nextInt();
			
			int[] arr = new int[N];
			for(int i=0 ; i<N ; i++) arr[i]=sc.nextInt();
			HashMap<Integer,Integer> hm = new HashMap<>();
			while(M-- >0)
			{
				int idx = sc.nextInt();
				int ele = sc.nextInt();
				idx--;
				if(arr[idx]+ele > H)
				{
					for(int key : hm.keySet())
					{
						arr[key] = arr[key] - hm.get(key);
					}
					hm.clear();
				}
				else
				{
					arr[idx]+=ele;
					if(hm.containsKey(idx))
					{
						hm.replace(idx,hm.get(idx)+ele);
					}
					else
					{
						hm.put(idx,ele);
					}
				}
			}
			for(int i=0 ; i<N ; i++) System.out.print(arr[i]+" ");
			System.out.println();
		}
	}
}