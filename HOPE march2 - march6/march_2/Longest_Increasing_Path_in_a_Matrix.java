class Longest_Increasing_Path_in_a_Matrix{

    public static int dfs(int i,int j,int[][] dp,int[][] matrix)
    {
        if(dp[i][j]!=0)
        {
            return dp[i][j];
        }
        int r = matrix.length;
        int c = matrix[0].length;

        int dx[] = {1,-1,0,0};
        int dy[] = {0,0,1,-1};
        int mp=0;
        for(int k=0;k<4;k++)
        {
            int x = i+dx[k];
            int y = j+dy[k];

            if(x>=0 && x<r && y>=0 && y<c && matrix[x][y]>matrix[i][j])
            {
                int curr = dfs(x,y,dp,matrix);
                dp[x][y] = curr;
                mp = Math.max(mp,curr);
            }
        }
        return mp+1;
    }
    public static int longestIncreasingPath(int[][] matrix) {
        
        int r=matrix.length;
        int c = matrix[0].length;

        int dp[][] = new int[r][c];
        int ans = 1;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(dp[i][j]==0)
                {
                    
                    dp[i][j] = dfs(i,j,dp,matrix);
                    ans = Math.max(ans,dp[i][j]);
                }
            }
        }
        return ans ;

    }
    public static void main(String[] args) {
        int matrix[][] = {{9,9,4},{6,6,8},{2,1,1}};
        System.out.println(longestIncreasingPath(matrix));
    }
}