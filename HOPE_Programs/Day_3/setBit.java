package Day_3;
import java.util.Scanner;

public class setBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 0;
        int setbits = 0;
        while(n>0){
            n = (n & (n-1));
            setbits++;
        }
        System.out.println("SetBits Count: " + setbits);
    }
}
