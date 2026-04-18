import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            if(!map.containsKey(c)){
                map.put(c,1);
            }
            else{
                map.put(c,map.get(c)+1);
            }
        }
        HashSet<Character> maxOccur = new HashSet<>();
        int max = 1;
        for(int k : map.values()){
            max = Math.max(max,k);
        }

        for(char c : map.keySet()){
            if(map.get(c) == max){
                maxOccur.add(c);
            }
        }
        for(char c : s.toCharArray()){
            if(!maxOccur.contains(c)){
                System.out.print(c);
            }
        }
    }
}