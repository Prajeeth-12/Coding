import java.util.*;


public class twoentity {
    public static int isVowel(char c){
        c = Character.toLowerCase(c);
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') return 1;
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0, -1);
        int count = 0;
        int maxLength = 0;
        for(int i=0;i<s.length();i++){
            count += (isVowel(s.charAt(i)) == 1)? 1 : -1;
            //System.out.println(count);
            /*if((isVowel(s.charAt(i))) == 1)
                System.out.println(s.charAt(i));*/
            if(map.containsKey(count)){
                maxLength = Math.max(maxLength, i - map.get(count));
            }
            else{
                map.put(count, i);
            }
        }
        System.out.println(maxLength);
    }
}
