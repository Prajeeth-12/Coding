package Day_4;
import java.util.*;

public class bin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        for(int i=0;i<tests;i++){
            int N = sc.nextInt();
            int arr[] = new int[N];
            for(int j=0;j<N;j++){
                arr[j] = sc.nextInt();
            }
            if(arr[0] == 0 && arr[N-1] == 0) System.out.println("Bob");
        }
    }
}
