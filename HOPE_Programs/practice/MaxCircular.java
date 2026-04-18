import java.util.*;

public class MaxCircular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int k = 0;k<n;k++) arr[k] = sc.nextInt();
        int i = 0;
        while(i<n && arr[i]<0) i++;
        int max = Integer.MIN_VALUE;
        if(i == n){
            for(int p : arr){
                max = Math.max(max,p);
            }
            System.out.print(max);
        }
        else{
        int j = i+1;
        int maxSum = arr[i];
        int curSum = arr[i];
        while(i!=j){
            if(j>=n)
                j = j%n;
            curSum += arr[j];
            maxSum = Math.max(maxSum,curSum);
            if(curSum < 0){
                i = j+1;
                curSum = arr[i];
                j++;
            }
            j++;
        }
        System.out.print(maxSum);
    }
    }
}
