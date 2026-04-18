import java.util.*;

public class CardensAlgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int k = 0;k<n;k++) arr[k] = sc.nextInt();
        int Maxsum = 0;
        int curSum = 0;
        for(int i=0;i<n;i++){
            curSum += arr[i];
            Maxsum = Math.max(curSum,Maxsum);
            if(curSum < 0) curSum = 0;
        }
        System.out.println(Math.max(Maxsum,nor));
    }
}
