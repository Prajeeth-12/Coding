import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            long s = sc.nextLong(); 
            long k = sc.nextLong(); 
            long m = sc.nextLong(); 
            
            long numFlips = m / k;
            long timeSinceLastFlip = m % k;
            long currentTop;

            if (numFlips % 2 == 0)
            {
                currentTop = s - Math.min(s, k) * (numFlips > 0 ? 0 : 0); 
                currentTop = s; 
            }
            else
            {
                currentTop = Math.min(s, k);
            }
            long remaining = Math.max(0, currentTop - timeSinceLastFlip);
            System.out.println(remaining);
        }
    }
}