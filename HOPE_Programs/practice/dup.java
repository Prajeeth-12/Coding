import java.util.*;

public class dup{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        int n = sc.nextInt();
        for(int i=0;i<n+2;i++){
            int num = sc.nextInt();
            if(!set.contains(num)){
                set.add(num);
            }
            else{
                System.out.print(num + " ");
            }
        }
    }
}