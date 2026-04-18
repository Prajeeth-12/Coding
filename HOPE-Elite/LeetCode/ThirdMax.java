import java.util.*;

public class ThirdMax
{
	public static void main (String[] args)
	{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int x = sc.nextInt();
            if(m*x < n){
                System.out.println(n-m*n);
            }
            else{
                System.out.println(0);
            }
        }
	}
}
