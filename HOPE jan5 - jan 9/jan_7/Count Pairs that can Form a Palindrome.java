import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      int n=sc.nextInt();
      sc.nextLine();
      String s;
      HashMap<Integer, Integer> alpcnt=new HashMap<>();
      for(int sh=0 ; sh<26 ; sh++)
      {
        alpcnt.put(1 << sh,0);
      }
      int odd=0,even=0;
      for(int i=0 ; i<n ; i++)
      {
        s=sc.nextLine();
        int xorv=0;
        for(char ch : s.toCharArray())
        {
          xorv ^= (1<<(ch-'a'));
        }
        if(xorv > 0)
        {
          odd++;
          alpcnt.put(xorv, alpcnt.getOrDefault(xorv, 0) + 1);
        }
        else
        {
          even++;
        }
      }
      int ans=0;
      ans += (even * (even-1))/2;
      ans += even * odd;
      for(int sh=0 ; sh<26 ; sh++)
      {
        ans += (alpcnt.get(1<<sh)*(alpcnt.get(1<<sh)-1))/2;
      }
      System.out.println(ans);
    }
}
