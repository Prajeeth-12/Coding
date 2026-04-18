import java.util.*;

public class dotCreater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String,Integer> map = new HashMap<>();
        int t = sc.nextInt();
        sc.nextLine();
        String[] strings = new String[t];
        int maxLen = 0;
        for (int i = 0; i < t; i++) {
            strings[i] = sc.nextLine();
            if (strings[i].length() > maxLen) {
                maxLen = strings[i].length();
            }
        }
        for(String s : strings){
            int curLen = s.length();
            if(curLen < maxLen){
                int space = maxLen - curLen;
                int pad = space/2;
                StringBuilder str = new StringBuilder();
                for(int i=0;i<pad;i++){
                    str.append(".");
                }
                str.append(s);
                for(int i=0;i<pad;i++){
                    str.append(".");
                }
                System.out.println(str);
            }
            else{
                System.out.println(s);
            }
        }

    }
}
