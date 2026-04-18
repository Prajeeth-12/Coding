import java.util.*;

public class Main {
	private static boolean isVowel(char ch)
	{
		return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u';
	}
	private static void dfs(String str,int idx,String res)
	{
		if(idx==str.length())
		{
			System.out.println(res);
			return;
		}
		dfs(str,idx+1,res);
		if(isVowel(str.charAt(idx)))
		{
			res += str.charAt(idx);
			dfs(str,idx+1,res);
		}
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        dfs(str,0,"");
    }
}