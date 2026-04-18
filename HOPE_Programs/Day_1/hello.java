public class hello {
    static long[] F = new long[1000];
    public static long fibo(int n){
        if(n<=1){
            F[n] = n;
            return n;
        }
        else{
            if(F[n-2] == 0){
                F[n-2] = fibo(n-2);
            }
            if(F[n-1] == 0){
                F[n-1] = fibo(n-1);
            }
            return F[n-2] + F[n-1];
        }
    }


    public static void main(String[] args) {
        System.out.println(fibo(90));
    }
}
