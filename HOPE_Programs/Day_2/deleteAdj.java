package Day_2;

import java.util.*;

public class deleteAdj {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k;
        for (int i = 0; i < n; i++) {
            k = sc.nextInt();
            if(stack.isEmpty()){
                stack.push(k);
            }
            else if(stack.peek() == k){
                stack.pop();
            }
            else{
                stack.push(k);
            }
        }
        //for(int i : arr){
        
        for(int i : stack){
            System.out.print(i + " ");
        }
    }
}
