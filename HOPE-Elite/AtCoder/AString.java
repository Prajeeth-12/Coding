import java.util.*;

public class AString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            if(!map.containsKey(c)){
                map.put(c,1);
            }
            else{
                map.put(c,map.get(c)+1);
            }
        }
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(char c : t.toCharArray()){
            if(!map2.containsKey(c)){
                map2.put(c,1);
            }
            else{
                map2.put(c,map2.get(c)+1);
            }
        }
        List<Integer> AidxS = new ArrayList<>();
        List<Integer> AidxT = new ArrayList<>();
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'A') AidxS.add(i);
        }
        for(int i=0;i<t.length();i++){
            if(t.charAt(i) == 'A') AidxT.add(i);
        }
        map.remove('A');
        map2.remove('A');
        if(!map.equals(map2)){
            System.out.print(-1);
        }
        else{
            HashSet<Integer> set = new HashSet<>();
            int ctr = 0;
            for(int i : AidxT){
                if(!AidxS.contains(i)){
                    ctr++;
                }
            }
            if(ctr == 0){
                System.out.println(0);
            }
            else
            System.out.println(ctr + 1);
        }
    }
}
