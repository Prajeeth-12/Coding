import java.util.*;

public class strTask{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        StringBuilder sb = new StringBuilder();

        for(char c:str.toCharArray()){
            if(c == 'a' || c == 'o' || c == 'y' || c == 'e' || c == 'u'|| c == 'i')
            {
                continue;
            }
            else
            {
                sb.append(c);
            }
        }

        StringBuilder newSB=new StringBuilder();
        for(int i=0;i<sb.length();i++)
        {
            newSB.append('.');
            newSB.append(sb.charAt(i));
        }
        System.out.println(newSB.toString());

        
    }
}