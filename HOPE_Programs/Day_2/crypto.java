package Day_2;


import java.util.*;

public class crypto{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        while(i<str.length()){
            char c = str.charAt(i);
            if(c != '#'){
                stack.push((int)(c - '0'));
            }
            else{
                if(stack.size() >= 2){
                    int ud = stack.pop();
                    int td = stack.pop();
                    int nd = td*10 + ud;
                    if(nd >0 && nd <= 26){
                        stack.push(nd);
                    }
                    else{
                        stack.push(td);
                        stack.push(ud);
                    }
                }
                
            }
            i++;
        }
        while(!stack.isEmpty()){
            int ch = stack.pop();
            //System.out.println(ch);
            sb.append((char)(ch + 'a' - 1));
        }
        System.out.println(sb.reverse().toString());
}
}