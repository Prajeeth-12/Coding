import java.util.*;

public class RepDig{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%10 == n/10%10 && n%10 == n/100%10){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
}