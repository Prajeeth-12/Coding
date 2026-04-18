import java.util.*;

public class digSumExce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        for(int i = 0; i <= n; i++){
            if(satisfyes(i,k)){
                count++;
            }
        }
        System.out.print(count);
    }

    private static boolean satisfyes(int n,int k){
        int sum = 0;
        while(n>0){
            sum += n%10;
            n/=10;
        }
        if(sum == k) return true;
        return false;
    }
}
