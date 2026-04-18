import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        long n = sc.nextLong();
        
        // Iterate from 62 down to 0
        for (int sh = 62; sh >= 0; sh--) {
            // Check if the bit at position 'sh' is set
            if (((n >> sh) & 1) == 1) {
                // Use 1L to prevent integer overflowAC
                System.out.print((1L << sh) + " ");
            }
        }
    }
}