import java.util.*;
public class Main{
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        while(t-- >0)
        {
            long a=scan.nextLong();
            long b=scan.nextLong();
            long c=scan.nextLong();
            long m=scan.nextLong();
            long nA=m/a;
            long nB=m/b;
            long nC=m/c;
            long AandB=m/(lcm(a,b));
            long BandC=m/(lcm(b,c));
            long AandC=m/(lcm(a,c));
            long alcmb=lcm(a,b);
            long AandBandC=m/lcm(alcmb,c);
            long ans1=6*nA- 3*AandC -3*AandB + 2*AandBandC;
            long ans2=6*nB- 3*BandC -3*AandB + 2*AandBandC;
            long ans3=6*nC- 3*AandC -3*BandC + 2*AandBandC;
            System.out.println(ans1+" "+ans2+" "+ans3);
            
        } 
    }
    static long lcm(long a,long b)
    {
        return a*b / gcd(a,b);
    }
    static long gcd(long a,long b)
    {
        while(b!=0)
        {
            long r=a%b;
            a=b;
            b=r;
        }
        return a;
    }
}