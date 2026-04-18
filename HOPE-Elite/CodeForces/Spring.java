import java.util.*;

public class Spring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int a,b,c,m;
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            int at = sc.nextInt();
            int bt = sc.nextInt();
            int ct = sc.nextInt();
            m = sc.nextInt();
            int ac = 0;
            int bc = 0;
            int cc = 0;
            for(int i=1;i<=m;i++){
                if(a == i && a == b && b == c && a == c){
                    ac += 2;
                    bc += 2;
                    cc += 2;
                }
                else if(a == i && a==b){
                    ac += 3;
                    bc += 3;
                }
                else if(b == i && b==c){
                    cc += 3;
                    bc += 3;
                }
                else if(a == i && a==c){
                    cc += 3;
                    ac += 3;
                }
                else{
                    if(a == i) ac+=6;
                    if(b == i) bc+=6;
                    if(c == i) cc+=6;
                }
                a += at;
                b += bt;
                c += ct;
            }
            System.out.println(ac + " " + bc + " " + cc);
        }
    }
}
