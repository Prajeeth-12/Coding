import java.util.*;

public class sortedSqr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double arr[] = new double[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            arr[i] = Math.pow((double)arr[i],2.0);
        }
        Arrays.sort(arr);
        for(double i : arr){
            System.out.print((int)i + " ");
        }
    }
}
