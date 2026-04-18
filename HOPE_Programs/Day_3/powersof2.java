package Day_3;

import java.util.*;

public class powersof2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 0;
        for(int i=n;i>=0;i--){
            int bit = 1<<i;
            if((s+bit) > n) continue;
            s+=bit;
            System.out.println("Bit: " + bit);
        }
    }
}
