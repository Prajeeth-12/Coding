import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      int n=sc.nextInt();
      int ans=0;
      for(int ctr=1 ; ctr>=0 ; ctr--)
      {
        int curr = sc.nextInt();
        ans ^= curr;
      }
      System.out.println(ans);
    }
}
