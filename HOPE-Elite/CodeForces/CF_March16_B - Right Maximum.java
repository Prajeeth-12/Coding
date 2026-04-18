import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0)
        {
            int N = sc.nextInt();
            int[] arr = new int[N];
            
            for(int i = 0; i < N; i++)
            {
                arr[i] = sc.nextInt();
            }
            
            int op_count = 0;
            int lastPos = N - 1;
            
            while(lastPos >= 0)
            {
                int maxVal = -1;
                for(int i = 0; i <= lastPos; i++)
                {
                    maxVal = Math.max(maxVal, arr[i]);
                }
                
                int rightmostPos = -1;
                for(int i = lastPos; i >= 0; i--)
                {
                    if(arr[i] == maxVal)
                    {
                        rightmostPos = i;
                        break;
                    }
                }
                op_count++;
                lastPos = rightmostPos - 1;
            }
            System.out.println(op_count);
        }
    }
}