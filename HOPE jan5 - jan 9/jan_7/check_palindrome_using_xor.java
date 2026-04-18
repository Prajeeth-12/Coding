import java.util.*;

public class Main{
	
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      String str = sc.nextLine();
      int mask=0;
      for(char c : str.toCharArray())
      {
      	mask ^= 1<<(c-'a');
      }
      if(mask==0 || (mask & (mask-1)) == 0)
      {
      	System.out.println("YES");
      }
      else
      {
    	System.out.println("NO");
      }
    }
}
