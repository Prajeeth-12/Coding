import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      int n=sc.nextInt();
      int ans[]=new int[n+n+2];
      int xorval=0;
      for(int i=0 ; i<n+n+2 ; i++)
      {
        ans[i]=sc.nextInt();
        xorval ^= ans[i];
      }  
      int sh=0;
      while(((xorval >> sh) & 1) == 0) sh++;
      int onesval=0;
      int zerosval=0;
      for(int num : ans)
      {
        if(((num >> sh)&1) == 1)
          onesval ^= num;
        else
          zerosval ^= num;
      }
      System.out.println(Math.min(onesval, zerosval) + " " + Math.max(onesval, zerosval));
    }
}
