import java.util.*;

public class countDot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sum = 0;
        for(char c : s.toCharArray()){
            if(c == 'i' || c == 'j' || c == 'I' || c == 'J'){
                sum++;
            }
        }
        System.out.println(sum);
    }
}
