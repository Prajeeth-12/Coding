import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        while(t-- >0)
        {
            int n=scan.nextInt();
            int arr[]=new int[n];
            boolean sorted=true;
            for(int i=0;i<n;i++)
            {
                arr[i]=scan.nextInt();
            }
            for(int i=0;i<n-1;i++)
            {
                if(arr[i]>arr[i+1])
                {
                    sorted=false;
                    break;
                }
            }
            if(sorted)
            {
                System.out.println(n);
            }
            else{
                System.out.println("1");
            }
        }
    }
}