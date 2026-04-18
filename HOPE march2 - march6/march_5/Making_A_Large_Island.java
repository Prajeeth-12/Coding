import java.util.*;

class Making_A_Large_Island {
    private static void dfs(int[][] isl , int[][] grid, int row, int col,int ictr)
    {
        isl[row][col]=ictr;
        int dir[]={0,1,0,-1,0};
        for(int i=0;i<4 ; i++)
        {
            int ar=row+dir[i];
            int ac=col+dir[i+1];
            if(ar>=0 && ar<grid.length && ac>=0 && ac<grid[0].length && grid[ar][ac]==1 && isl[ar][ac]==0)
            {
                dfs(isl,grid,ar,ac,ictr);
            }
        }
    }

    public static int largestIsland(int[][] grid) {
        int R = grid.length;
        int C = grid[0].length;
        int[][] isl = new int[R][C];
        int ictr=1;
        for(int i=0 ; i<R ; i++)
        {
            for(int j=0 ; j<C ; j++)
            {
                if(grid[i][j]==1 && isl[i][j]==0)
                {
                    dfs(isl,grid,i,j,ictr);
                    ictr++;
                }
            }
        }

        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i=0 ; i<R ; i++)
        {
            for(int j=0 ; j<C ; j++)
            {
                if(isl[i][j]!=0)
                {
                    int val = hm.getOrDefault(isl[i][j],0);
                    hm.put(isl[i][j],val+1);
                }
            }
        }

        int ans=0;
        for(int i=0 ; i<R ; i++)
        {
            for(int j=0 ; j<C ; j++)
            {
                if(isl[i][j]==0)
                {
                    int length=1;
                    HashSet<Integer> hs = new HashSet<>();
                    int dir[]={0,1,0,-1,0};
                    for(int k=0;k<4 ; k++)
                    {
                        int ar=i+dir[k];
                        int ac=j+dir[k+1];
                        if(ar>=0 && ar<grid.length && ac>=0 && ac<grid[0].length)
                        {
                            hs.add(isl[ar][ac]);
                        }
                    }
                    for(int adj : hs)
                    {
                        length += hm.get(adj);
                    }
                    ans = Math.max(ans,length);
                }
            }
        }

        return ans;
    }
    public static void main(String args[])
    {
        int[][] grid = {{1,0},{0,1}};
        System.out.println(largestIsland(grid));
    }
}