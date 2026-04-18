import java.util.*;

class N_queens {

    static List<List<String>> res=new ArrayList<>();
    private static boolean isValid(int[][] grid, int row, int col)
    {
        //column
        int i=row;
        while(i>=0)
        {
            if(grid[i][col]==1)
            {
                return false;
            }
            i--;
        }

        //diagonal left-upper
        i=row;
        int j=col;
        while(i>=0 && j>=0)
        {
            if(grid[i][j]==1)
            {
                return false;
            }
            i--;
            j--; 
        }

        //diagonal right-upper
        i=row;
        j=col;
        while(i>=0 && j<grid.length)
        {
            if(grid[i][j]==1)
            {
                return false;
            }
            i--;
            j++; 
        }

        return true;
    }

    private static void queens(int row,int[][] grid, int n)
    {
        if(row==n)
        {
            ArrayList<String> val=new ArrayList<>();
            for(int i=0; i<grid.length ; i++)
            {
                StringBuilder sb=new StringBuilder();
                for(int j=0 ; j<grid[0].length ; j++)
                {
                    if(grid[i][j]==0) sb.append(".");
                    else sb.append("Q");
                }
                val.add(sb.toString());
            }
            res.add(val);
            return;
        }
        for(int col=0 ; col<n ; col++)
        {
            if(isValid(grid,row,col))
            {
                grid[row][col]=1;
                queens(row+1,grid,n);
                grid[row][col]=0;
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        
        int[][] grid = new int[n][n];
        queens(0,grid,n);
        List<List<String>> final_res = new ArrayList<>();
        for (List<String> inner : res)
        {
            final_res.add(new ArrayList<>(inner));
        }

        res.clear();
        return final_res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        N_queens obj = new N_queens();
        List<List<String>> ans = obj.solveNQueens(n);
        for (List<String> inner : ans)
        {
            for (String s : inner)
            {
                System.out.println(s);
            }
            System.out.println("--------");
        }

    }
}