package Day_3;
import java.util.Scanner;

public class jersey2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int zero=0,one=0;
        for(int i=1;i<=(n+n+2);i++)
        {
            int curr=sc.nextInt();
            int newbit=Integer.parseInt(Integer.toBinaryString(curr));
            if((newbit/10)%10==1)
            {
                one^=curr;
            }
            else
            {
                zero^=curr;
            }
        }
        System.out.print(one+" "+zero);
    }
}