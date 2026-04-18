import java.util.*;
public class HugePileOptimized{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- > 0) {
            int n=sc.nextInt();
            int tar=sc.nextInt();
            int right=n, left =n;
            int res=0;
            boolean flag=true;
            while(right >= tar) {
                if((right == tar) || (left == tar)){
                    flag=false;
                    System.out.println(res);
                    break;
                }
                left=left/2;
                right=(right+1)/2;
                res++;
            }
            if(flag){
                System.out.println("-1"); 
            }
        }
    }
}

