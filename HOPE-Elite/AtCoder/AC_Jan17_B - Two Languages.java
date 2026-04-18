import java.util.*;

public class Main{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int N =sc.nextInt();
		int M =sc.nextInt();
		sc.nextLine();
		String S =sc.nextLine();
		String T =sc.nextLine();
		
		int Q =sc.nextInt();
		sc.nextLine();
		while(Q-->0)
		{
			String str = sc.nextLine();
			
			ArrayList<Character> str_char = new ArrayList<>();
			for(char c : str.toCharArray())
			{
				str_char.add(c);
			}
			
			int s_freq=0;
			for(char ch : S.toCharArray())
			{
				s_freq += Collections.frequency(str_char,ch);
			}
			
			int t_freq=0;
			for(char ch : T.toCharArray())
			{
				t_freq += Collections.frequency(str_char,ch);
			}
			
			if(s_freq > t_freq)
			{
				System.out.println("Takahashi");
			}
			else if(s_freq < t_freq)
			{
				System.out.println("Aoki");
			}
			else
			{
				System.out.println("Unknown");
			}
		}
		
	}
}