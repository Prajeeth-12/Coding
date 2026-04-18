import java.util.*;

public class Main{
	
  public static boolean powerOfTwo(int n)
  {
    return n > 0 && ((n & (n - 1)) == 0);
  }
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      int n=sc.nextInt();
      System.out.println(powerOfTwo(n));
    }
}
