import java.util.*;

public class TargetSumRecur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        helper(0, arr, target, 0);
    }

    public static void helper(int idx, int nums[], int target, int curSum){
        if(target == curSum){
            System.out.println("YESSSS");
            return;
        }
        if(idx >= nums.length) return;
        if(curSum > target) return;
        
        //picking an element
        helper(idx+1, nums, target, curSum + nums[i]);
        //not picking an element
        helper(idx+1, nums, target, curSum);
    }
}
