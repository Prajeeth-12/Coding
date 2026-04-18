import java.util.*;
class Main{
    public static void bin(int n)
    {
      if(n==0) return ;
      bin(n/2);
      System.out.print(n%2);
    }
    
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      int a=sc.nextInt();
      bin(a);
      
  }
}