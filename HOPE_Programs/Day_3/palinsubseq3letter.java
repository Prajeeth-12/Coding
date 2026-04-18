package Day_3;
import java.util.*;

public class palinsubseq3letter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashMap<Character,Integer> RHS = new HashMap<>();
        HashMap<Character,Integer> LHS = new HashMap<>();

        for(char ch : s.toCharArray()){
            if(RHS.containsKey(ch)){
                RHS.put(ch,(RHS.get(ch)) + 1);
            }
            else{
                RHS.put(ch,1);
                LHS.put(ch,0);
            }
        }
        System.out.println("RHS: " + RHS);
        System.out.println("LHS: " + LHS);
        int ways = 0;
        RHS.put(s.charAt(0),RHS.get(s.charAt(0))-1);
        LHS.put(s.charAt(0),LHS.get(s.charAt(0))+1);
        for(int i=1;i<s.length()-1;i++){
            RHS.put(s.charAt(i),(RHS.get(s.charAt(i)))-1);
            for(char ch : RHS.keySet()){
                ways += RHS.get(ch) * LHS.get(ch);
            }
            LHS.put(s.charAt(i),LHS.get(s.charAt(i))+1);
        }
        System.out.print(ways);
    }
}
