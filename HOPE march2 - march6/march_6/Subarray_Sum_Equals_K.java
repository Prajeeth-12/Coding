import java.util.HashMap;

class Subarray_Sum_Equals_K {
    public int subarraySum(int[] nums, int k) {
       HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,1);
        int sum=0;
        int count=0;
        for(int i=0 ; i<nums.length ; i++)
        {
        	sum += nums[i];
        	int rem = sum - k;
        	if(hm.containsKey(rem))
        	{
        		count += hm.get(rem);
        	}
        	hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        System.out.println(count);
        return count;
    }
}