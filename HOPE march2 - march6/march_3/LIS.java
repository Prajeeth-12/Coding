import java.util.*;

public class LIS {
    public int lengthOfLIS(int[] nums) {            
        int[] dp = new int[nums.length];
        Arrays.fill(dp,1);
        int len = nums.length;
        int max = 1;
        for(int i=1 ; i<len ; i++)
        {
            for(int j=0 ; j < i ; j++)
            {
                if(nums[j] < nums[i])
                {
                    dp[i] = Math.max(dp[i],dp[j]+1) ;
                    max = Math.max(max,dp[i]);
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        LIS obj = new LIS();
        int[] nums = {10,9,2,5,3,7,101,18};
        System.out.println(obj.lengthOfLIS(nums));
    }
}