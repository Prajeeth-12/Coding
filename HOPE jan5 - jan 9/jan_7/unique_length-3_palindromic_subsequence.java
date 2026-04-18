import java.util.*;

public class Main{
    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
    	String s=sc.nextLine();
        int n = s.length();
        int result = 0;
        
        int[] first = new int[26];
        int[] last = new int[26];
        Arrays.fill(first, -1);
        Arrays.fill(last, -1);
        
        for (int i = 0; i < n; i++) {
            int char_index = s.charAt(i) - 'a';
            if (first[char_index] == -1) {
                first[char_index] = i;
            }
            last[char_index] = i;
        }
        
        for (int i = 0; i < 26; i++)
        {
            if (first[i] != -1 && first[i] < last[i]) {
                for (int j = first[i] + 1; j < last[i]; j++) {
                        result++;
                    }
                }
        }
        System.out.println(result);
    }
}