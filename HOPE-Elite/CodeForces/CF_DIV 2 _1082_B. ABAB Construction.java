import java.util.*;
public class Main{
    public static void main(String []args)
    {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        scan.nextLine();
        while(t-- >0)
        {
            int n=scan.nextInt();
            scan.nextLine();
            String s=scan.nextLine();
            if(s.length()%2==1 && s.charAt(0)=='b')
            {
                System.out.println("NO");
                continue;
            }
            int ind=s.length()%2==1 ? 1:0;
            boolean found=true;
            for(int i=ind;i<s.length()-1;i+=2)
            {
                if(s.charAt(i)==s.charAt(i+1) && s.charAt(i)!='?')
                {
                    System.out.println("NO");
                    found=false;
                    break;
                }
            }
            if(found)
            {
                System.out.println("YES");
            }
        }
    }
}