package Day_2;
import java.util.*;

public class dim{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    Stack<Integer> stk = new Stack<>();
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    for(int i=0;i<n;i++){
      if(stk.isEmpty()){
        stk.push(arr[i]);
      }
      else if(stk.size() >= 3 && stk.peek() == arr[i]){
        int safe1 = stk.pop();
        int safe2 = stk.pop();
        int safe3 = stk.pop();
        if(!((arr[i] == safe1) && (safe1 == safe2) && (safe2 == safe3))){
          stk.push(safe3);
          stk.push(safe2);
          stk.push(safe1);
          stk.push(arr[i]);

        }

      }
      else{
        stk.push(arr[i]);
      }
    }
    
    for(int k : stk){
      System.out.print(k + " ");
    }
    System.out.println();
    System.out.println(stk.size());
  }
}