
import java.util.Scanner;

public class rev_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int i = 0;
        int j = n-1;
        while(i<j){
            while(arr[i]%2 == 0){
                i++;
            }
            while(arr[j]%2 == 0){
                j--;
            }
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++;
            j--;
        }
        for(int k : arr){
            System.out.print(k + " ");
        }
    }
}
