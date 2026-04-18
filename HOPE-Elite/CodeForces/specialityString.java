import java.util.*;

public class specialityString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            Stack<Character> stk=new Stack<>();
            for(char ch:s.toCharArray()){
                if(!stk.isEmpty() && stk.peek()==ch){
                    stk.pop();
                }
                else{
                    stk.push(ch);
                }
            }
            if(stk.isEmpty())
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}