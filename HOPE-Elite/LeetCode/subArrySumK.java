import java.util.*;

public class subArrySumK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int arr[] = new int[N];
        for(int i=0;i<N;i++) arr[i] = sc.nextInt();
        int ctr = 0;
        int curSum = arr[0];
        int lt = 0, rt = 0;
        while(rt<N && lt<=rt){
            if(curSum == K) ctr++;
            if(curSum <= K){
                curSum += arr[rt];
                rt++;
            }
            else{
                curSum -= arr[lt];
                lt++;
            }
        }
        System.out.println(ctr);
    }
}
