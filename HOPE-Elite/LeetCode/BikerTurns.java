import java.util.*;

public class BikerTurns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] grid = {
            {'R', '.', 'B', '.', '.'},
            {'.', 'B', '.', '.', 'B'},
            {'.', '.', '.', 'B', '.'},
            {'B', 'B', '.', '.', '.'},
            {'.', '.', 'B', '.', 'D'}
        };
        int R = grid.length;
        int C = grid[0].length;
        boolean vis[][] = new boolean[R][C];
        int rab[] = new int[2];
        for(int row=0;row<R;row++){
            for(int col=0;col<C;col++){
                if(grid[row][col] == 'R'){
                    rab = new int[] {row,col};
                    vis[row][col] = true;
                }
            }
        }
        System.out.println(Sol(vis,grid,rab,R,C));
    }

    public static int Sol(boolean vis[][], char[][] grid, int[] rab,int R, int C){
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(rab);
        int turns = -1;
        int die[] = new int[] {1,0,-1,0,1};
        while(!queue.isEmpty()){
            turns++;
            int siz = queue.size();

            for(int k = 0;k<siz;k++){
                int curr[] = queue.poll();
                for(int row=0;row<R;row++){
                    if(grid[row][curr[1]] == 'D')
                        return turns;
                }
                for(int col=0;col<C;col++){
                    if(grid[curr[0]][col] == 'D')
                        return turns;
                }
                for(int dirs=0;dirs<4;dirs++){
                    int ar = curr[0] + die[dirs];
                    int ac = curr[1] + die[dirs+1];
                    if(ar<0 || ar>=R || ac<0 || ac>=C || grid[ar][ac] == 'B' || vis[ar][ac] == true)
                        continue;
                    else if(grid[ar][ac] == 'C')
                        return turns;
                    vis[ar][ac] = true;
                    queue.offer(new int[] {ar,ac});
                }
            }
        }
        return -1;
    }
}
