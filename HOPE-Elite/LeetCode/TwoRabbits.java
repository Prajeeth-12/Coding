import java.util.*;

public class TwoRabbits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] grid = {
            {'X', '.', 'B', '.', '.'},
            {'.', 'B', '.', '.', 'B'},
            {'.', '.', 'C', 'B', 'Y'},
            {'B', 'B', '.', '.', '.'},
            {'.', '.', 'B', '.', '.'}
        };
        int R = grid.length;
        int C = grid[0].length;
        boolean vis1[][] = new boolean[R][C];
        boolean vis2[][] = new boolean[R][C];
        int rab1[] = new int[2];
        int rab2[] = new int[2];
        for(int row=0;row<R;row++){
            for(int col=0;col<C;col++){
                if(grid[row][col] == 'X'){
                    rab1 = new int[] {row,col};
                    vis1[row][col] = true;
                }
                if(grid[row][col] == 'Y'){
                    rab2 = new int[] {row,col};
                    vis2[row][col] = true;
                }
            }
        }
        int rabSteps1 = Sol(vis1,grid,rab1,R,C);
        int rabSteps2 = Sol(vis2,grid,rab2,R,C);
        if(rabSteps1 == -1 && rabSteps2 == -1) System.out.println("No Winner");
        else if(rabSteps1 == rabSteps2) System.out.println("Rabbit 1 and Rabbit 2 draws");
        else if(rabSteps2 != -1 && rabSteps1 < rabSteps2) System.out.println("Rabbit 1 Wins");
        else if(rabSteps2 != -1 && rabSteps1 > rabSteps2) System.out.println("Rabbit 2 Wins");
        
    }

    public static int Sol(boolean vis[][], char[][] grid, int[] rab,int R, int C){
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(rab);
        int steps = 0;
        int die[] = new int[] {1,0,-1,0,1};
        while(!queue.isEmpty()){
            steps++;
            int siz = queue.size();

            for(int k = 0;k<siz;k++){
                int curr[] = queue.poll();
                for(int dirs=0;dirs<4;dirs++){
                    int ar = curr[0] + die[dirs];
                    int ac = curr[1] + die[dirs+1];
                    if(ar<0 || ar>=R || ac<0 || ac>=C || grid[ar][ac] == 'B' || vis[ar][ac] == true)
                        continue;
                    else if(grid[ar][ac] == 'C'){
                        return steps;
                    }
                    vis[ar][ac] = true;
                    queue.offer(new int[] {ar,ac});
                }
            }
        }
        return -1;
    }
}
