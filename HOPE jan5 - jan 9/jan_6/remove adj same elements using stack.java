import java.util.*;
public class Main{
  public static void main(String[] args){
    Stack<Integer> st=new Stack<>();
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int i=0;
    while(i<n){
      int t=sc.nextInt();
      if(st.size()<3) st.push(t);
      else{
        int f=st.pop();
        int s=st.pop();
        int th=st.pop();
        if(!(f==s && s==th && s==t)){
          st.push(th);
          st.push(s);
          st.push(f);
          st.push(t);
        }
      }
      i++;
    }
    System.out.println(st.size());
  }
}