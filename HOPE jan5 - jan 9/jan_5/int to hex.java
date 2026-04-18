import java.util.*;
class Main{
    public static void hex(int n)
    {
    	char arr[]="0123456789ABCDEF".toCharArray();
      	if(n==0) return ;
      	hex(n/16);
      	System.out.print(arr[n%16]);
    }
    
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      int a=sc.nextInt();
      hex(a);
      
  }
}