class Patching_Array {
    public static int minPatches(int[] nums, int n) {
        long till = 1;
        int miss = 0;
        int idx=0;
        int len = nums.length;
        while(till <= n )
        {
            if(idx < len && till >= nums[idx])
            {
                till += nums[idx];
                idx++;
            }
            else
            {
                miss++;
                till += till;
            }
        }
        return miss ;
    }
    public static void main(String[] args) {
        Patching_Array obj = new Patching_Array();
        int[] nums = {1,3};
        int n = 6;
        System.out.println(obj.minPatches(nums,n));
    }
}
