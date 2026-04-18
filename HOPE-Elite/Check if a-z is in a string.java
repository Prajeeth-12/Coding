import java.util.*;
public class Main{
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        while(t-- >0)
        {
            int n=scan.nextInt();
            int arr[]=new int[n];
            boolean found=false;
            for(int i=0;i<n;i++)
            {
                arr[i]=scan.nextInt();
                if(arr[i]==67)
                {
                    found=true;
                }
            }
            if(!found)
            {
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
    }
}