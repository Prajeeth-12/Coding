package Day_3;
import java.util.*;

public class cakeProb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int temp = y;
        while(y>1){
            if(y%x == 0){
                y /= x;
            }
            else{
                System.out.print("NO");
                break;
            }
        }
        if(y==1)
            System.out.println("YES");
    }
}
