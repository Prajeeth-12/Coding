import java.util.*;

public class runningSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += sc.nextInt();
            arr[i] = sum;
        }
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
