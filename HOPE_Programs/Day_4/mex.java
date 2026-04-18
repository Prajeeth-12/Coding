package Day_4;
import java.util.Scanner;

public class mex{
    public static void main(String[] args){
    	
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0)
        {

            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
            {
                a[i] = sc.nextInt();
            }
            int[] freq = new int[n + 5];
            for (int num : a)
            {
                if (num <= n + 2)
                {
                    freq[num]++;
                }
            }
            int remainingSlots = k - 1;
            int mex = 0;
            while (mex <= n && remainingSlots > 0)
            {
                if (freq[mex] > 0)
                {
                    remainingSlots--;
                    mex++;
                }
                else
                {
                    break;
                }
            }
            System.out.println(mex);
        }

    }
}