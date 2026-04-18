import java.util.*;

public class combi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        for(int i=0;i<(1<<n);i++){
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<n;j++){
                if((i&(1<<j)) > 0){
                    sb.append(s.charAt(n-1-j));
                }
            }
            System.out.println(sb.toString());
        }
    }
}
