
class Solution {
    public int firstMissingPositive(int[] nums) {
        
        Map<Integer,Integer> hm = new TreeMap<>();
        for(int i=0 ; i<nums.length ; i++)
        {
            if(nums[i]>0) {
             hm.put(nums[i],1);
            }
        }
        int missing_num=1;
        while(true)
        {
            if(!hm.containsKey(missing_num))
            {
                return missing_num;
            }
            missing_num++;
        }
    }
}