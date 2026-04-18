import java.util.*;
public class Main{
  static class Pair{
    int eggs;
    int daycount;
    Pair(int eggs,int daycount)
    {
      this.eggs=eggs;
      this.daycount=daycount;
    }
  }
  public static void main(String[]args)
  {
      Scanner scan=new Scanner(System.in);
    int t=scan.nextInt();
      while(t-- >0)
      {
          Queue<Pair>queue=new LinkedList<>();
          int n=scan.nextInt();
    int d=scan.nextInt();
    int a[]=new int[n];
    int b[]=new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=scan.nextInt();
    }
    for(int i=0;i<n;i++)
    {
      b[i]=scan.nextInt();
    }
    for(int i=0;i<n;i++)
    {
       int purchased=a[i];
       queue.add(new Pair(purchased,i+1));
       int used=b[i];
       while(used>0 && !queue.isEmpty())
       { 
           if(queue.peek().eggs>=used)
           {
               queue.peek().eggs-=used;
               used=0;
               if(queue.peek().eggs==0)
               {
                   queue.poll();
               }
           }
           else{
               used-=queue.peek().eggs;
               queue.poll();
           }
       }
       while(!queue.isEmpty() && (i+1)-queue.peek().daycount >=d)
       {
         queue.poll();
       }
    }
      int ans=0;
      while(!queue.isEmpty())
      {
          Pair p=queue.poll();
          ans+=p.eggs;
      }
      System.out.println(ans);
      }
  }
}