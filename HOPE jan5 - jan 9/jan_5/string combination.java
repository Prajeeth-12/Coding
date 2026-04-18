import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      String str= sc.nextLine();
      for(int i= 0; i<(1 << str.length()) ; i++){
          StringBuilder sb= new StringBuilder();
          for(int j=0; j<str.length(); j++){
              if((i & (1 << j)) > 0) sb.append(str.charAt(j));
          }
          System.out.println(sb.toString());
      }
  }
}