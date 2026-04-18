class Number_of_Provinces {

    private static void dfs(int[][] isConnected,int city)
    {
        for(int j=0 ; j<isConnected.length ; j++)
        {
            if(isConnected[city][j] == 1)
            {
                isConnected[city][j]=0;
                dfs(isConnected,j);
            }
        }
        return ;
    }

    public static int findCircleNum(int[][] isConnected) {
        int R=isConnected.length;
        int C = isConnected[0].length;
        int count=0;
        for(int i=0 ;i<R ; i++)
        {
            if(isConnected[i][i]==1)
            {
                dfs(isConnected,i);
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] isConnected = {{1,1,0},{1,1,0},{0,0,1}};
        System.out.println(findCircleNum(isConnected));
    }
}