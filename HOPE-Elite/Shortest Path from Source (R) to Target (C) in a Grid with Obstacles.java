import java.util.*;

public class Main {
	
	public static int Sol(char[][] grid, int[] rab,int r, int c){
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(rab);
        int steps = 0;
        //int DIRS[][] = new int[][] {{1,0},{0,1},{-1,0},{0,-1}};
        int die[] = new int[] {1,0,-1,0,1};
        while(!queue.isEmpty())
        {
            steps++;
            int siz = queue.size();

            for(int k = 0;k<siz;k++)
            {
                int curr[] = queue.poll();
                for(int dirs=0;dirs<4;dirs++){
                    int x = curr[0] + die[dirs];
                    int y = curr[1] + die[dirs+1];
                    if(x<0 || x>=r || y<0 || y>=c || grid[x][y] == 'B')
                        continue;
                    else if(grid[x][y] == 'C'){
                        return steps;
                    }
                    grid[x][y] = 'B';
                    queue.offer(new int[] {x,y});
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int rab[] = new int[3];
        char[][] grid = new char[r][c];
        for(int i=0;i<r;i++){
        	String S = sc.nextLine();
            for(int j=0 ; j<S.length() ; j++){
            	grid[i][j] = S.charAt(i);
                if(grid[i][j] == 'R')
                    rab = new int[]{i,j,0};
            }
        }
        System.out.println(Sol(grid,rab,r,c));
    }
}