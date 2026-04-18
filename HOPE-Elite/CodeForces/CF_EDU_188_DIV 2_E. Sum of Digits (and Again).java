import java.util.*;
public class sumofdigit_E
{
    public static long single_d(String n)
    {
        long sum=0;
        for(int i=0;i<n.length();i++)
        {
            sum+=n.charAt(i)-'0';
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        ArrayList<Long> val1=new ArrayList<>();
        ArrayList<Long> val2=new ArrayList<>();
        ArrayList<String> val3=new ArrayList<>();
        for(long i=0;i<10;i++)
        {
            val1.add(i);
            val2.add(i);
            val3.add(String.valueOf(i));
        }
        for(long i=10;i<=900000;i++)
        {
            long num=i;
            val1.add(i);
            StringBuilder sb=new StringBuilder(String.valueOf(num));
            while(num>9)
            {
                num=single_d(String.valueOf(num));
                sb.append(num);
            }
            val3.add(sb.toString());
            val2.add(single_d(sb.toString()));
        }
        while(t-->0) {
            String str=sc.next();
            if(str.length()==1)
            {
                System.out.println(str);
                continue;
            }
            int sum=0;
            int[] f1=new int[10];
            for(int i=0;i<str.length();i++)
            {
                sum+=str.charAt(i)-'0';
                f1[str.charAt(i)-'0']++;
            }
            StringBuilder sb=new StringBuilder();
            for (int i = 0; i <= 900000; i++) {
                if (sum - val2.get(i) == val1.get(i)) {
                    String v = val3.get(i);
                    int[] f2 = new int[10];
                    boolean f = true;
                    for (char j : v.toCharArray()) {
                        f2[j - '0']++;
                    }
                    for (int j = 0; j <= 9; j++) {
                        if (f1[j] < f2[j]) {
                            f = false;
                            break;
                        }
                    }
                    if (f) {
                        for (int j = 9; j >= 0; j--) {
                            if (f1[j] > 0) {
                                sb.append(String.valueOf(j).repeat(f1[j] - f2[j]));
                            }
                        }
                        sb.append(val3.get(i));
                        break;
                    }
                }
            }
            System.out.println(sb.toString());
        }
    }
}