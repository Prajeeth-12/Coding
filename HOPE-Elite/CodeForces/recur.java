import java.util.*;

public class recur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        revStr(s, s.length()-1);
    }

    private static void revStr(String s,int idx){
        if(idx == -1) return;
        else{
            System.out.print(s.charAt(idx));
            revStr(s,idx-1);
        }
    }
}
