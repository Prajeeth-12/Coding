import java.util.*;

public class Main {
	
	private static void dfs(String str,int idx,String res)
	{
		if(idx==str.length())
		{
			System.out.println(res);
			return;
		}
		dfs(str,idx+1,res);
		dfs(str,idx+1,res+str.charAt(idx));
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        dfs(str,0,"");
    }
}