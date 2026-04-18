import java.util.*;

public class ShiftedMex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        int t = sc.nextInt();
        while(t-- > 0){
            //Input
            int n = sc.nextInt();
            int arr[] = new int[n];
            int curMin = Integer.MAX_VALUE;
            // Array and finding Min
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
                curMin = Math.min(curMin,arr[i]);
            }
            // First one
            int arr1[] = new int[n];
            for(int i=0;i<n;i++){
                set1.add(arr[i] + curMin);
            }
            // Second One
            int arr2[] = new int[n];
            for(int i=0;i<n;i++){
                set1.add(arr[i] + (-curMin));

            }
            for(int i=0;i<n;i++){
                System.out.print(arr2[i] + " ");
            }
            System.out.println();
            for(int i=0;i<n;i++){
                System.out.print(arr1[i] + " ");
            }
            System.out.println();
            int Mex1 = findMex(arr1,n);
            int Mex2 = findMex(arr2,n);
            System.out.print(Mex1 + " " + Mex2 + "\n");

            System.out.println(Math.max(Mex1,Mex2));
        }
    }
    private static int findMex(int arr[],int n){
        Arrays.sort(arr);
        int k = 0;
        int i = 0;
        while(arr[i] < 0) i++;
        while(i<n){
            if(k != arr[i]){
                return k;
            }
            i++;
            k++;
        }
        return k;
    }
}
