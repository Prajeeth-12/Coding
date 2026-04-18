import java.util.*;
class Main{
    public static void rec(int n)
    {
      if(n==0) return ;
      rec(n--);
      System.out.println(n);
    }
    
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      int a=sc.nextInt();
      rec(a);
      
  }
}