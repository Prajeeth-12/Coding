import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      int n = sc.nextInt();
      sc.nextLine();
      int longest_substring_length = 0;
      for(int i=0 ; i<n ; i++)
      {
        String str = sc.nextLine();
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int flag=0;
        int long_seq=0;
        for(int j=0 ; j<str.length() ; j++)
        {
          char ch = str.charAt(j);
          flag += (ch=='1') ? 1 : -1 ;
          if(map.containsKey(flag))
          {
            int dif = j - map.get(flag) ;
            long_seq = Math.max(long_seq, dif);
          }
          else
          {
            map.put(flag, j);
          }
        }
        longest_substring_length = Math.max(longest_substring_length, long_seq);
      }
      System.out.println(longest_substring_length);    
  }
}