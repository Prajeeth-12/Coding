import java.util.*;

public class MaxStraight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++) arr[i] = sc.nextInt();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i]-1)){
                map.put(arr[i],map.get(arr[i]-1) + 1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        int maxNum = 0;
        for(int key : map.keySet()){
            maxNum = Math.max(maxNum,(int)map.get(key));
        }
        System.out.println(maxNum);
    }
}
