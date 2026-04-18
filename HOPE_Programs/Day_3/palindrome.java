package Day_3;
import java.util.*;

public class palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int f = 0;
        for(char ch : s.toCharArray()){
            f ^= (1<<(ch-'a'));
        }
        if((f&(f-1)) == 0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
