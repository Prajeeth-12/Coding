import java.util.*;

public class Main{
	
    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
    	int x=sc.nextInt();
    	int y=sc.nextInt();
    	while(x%y==0)
    	{
    		x=x/y;
    	}
    	if(x==1) System.out.println("YES");
    	else System.out.println("NO");
    }
}