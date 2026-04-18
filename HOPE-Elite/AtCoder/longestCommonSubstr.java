import java.util.*;

public class longestCommonSubstr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        int comMat[][] = new int[s.length() + 1][t.length() + 1];
        for(int i=0;i<s.length();i++){
            for(int j=0;j<t.length();j++){
                if(s.charAt(i) == t.charAt(j)){
                    comMat[i+1][j+1] = comMat[i][j]+1;
                }
            }
        }
        int maxLen = 0;
        for(int i=0;i<=s.length();i++){
            for(int j=0;j<=t.length();j++){
                maxLen = Math.max(comMat[i][j],maxLen);
            }
        }
        System.out.println("Maximum Length: " + maxLen);
    }
}
