class Maximum_Length_of_Repeated_Subarray {
    public int findLength(int[] num1, int[] num2) {
        
    	int R = num1.length;
    	int C = num2.length;
    	int[][] arr = new int[R][C];
    	int max_len = 0;
    	for(int r=0 ; r<R ; r++)
    	{
    		for(int c=0 ; c<C ; c++)
    		{
    			if(num1[r] == num2[c])
    			{
    				if(r>0 && c>0)
    				{
    					arr[r][c] = arr[r-1][c-1] + 1;
    				}
                    else
    				{
    					arr[r][c]=1;
    				}
                    max_len = Math.max(max_len,arr[r][c]);
    			}
    		}
    	}
    	return max_len;
    }
    public static void main(String[] args) {
        Maximum_Length_of_Repeated_Subarray obj = new Maximum_Length_of_Repeated_Subarray();
        int[] num1 = {1,2,3,2,1};
        int[] num2 = {3,2,1,4,7};
        System.out.println(obj.findLength(num1,num2));
    }
}