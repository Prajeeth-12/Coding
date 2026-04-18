import java.util.*;

public class octave{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        while(y-- > 0){
            x*=2;
        }
        System.out.println(x);
    }
}