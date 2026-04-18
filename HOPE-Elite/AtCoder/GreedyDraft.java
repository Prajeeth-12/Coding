import java.util.*;

public class GreedyDraft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        while(n-- > 0){
            int l = sc.nextInt();
            int flag = 0;
            int x = 0;
            int arr[] = new int[l];
            for(int i=0;i<l;i++) arr[i] = sc.nextInt();
            for(int i: arr){
                if(!set.contains(i)){
                    flag = 1;
                    set.add(i);
                    x = i;
                    break;
                }
            }
            if(flag == 1){
                System.out.println(x);
            }
            else{
                System.out.println(0);
            }
        }
    }
}
