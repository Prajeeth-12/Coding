import java.util.*;

public class Main{
	
	public static int bfs(char[][] grid, int[] rab_pos, int R, int C)
	{
		Queue<int[]> queue = new LinkedList<>();
		queue.offer(rab_pos);
		grid[rab_pos[0]][rab_pos[1]]='#';
		
		int dir[] = new int[]{0,1,0,-1,0};
		while(!queue.isEmpty())
		{
			int[] cur = queue.poll();
			for(int idx=0 ; idx<4 ; idx++)
			{
				int adjR = cur[0]+dir[idx];
				int adjC = cur[1]+dir[idx+1];
				
				if(adjR<0 || adjR>=R || adjC<0 || adjC >=C || grid[adjR][adjC]=='#')
				{
					continue;
				}
				
				if(grid[adjR][adjC]=='C')
				{
					return cur[2]+1;
				}
				grid[adjR][adjC]='#';
				queue.offer(new int[]{adjR,adjC,cur[2]+1});
				
			}
		}
		return -1;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();
		sc.nextLine();
		char[][] grid = new char[R][C];
		
		int[] rab_pos = new int[3];
		
		for(int row=0 ; row<R ; row++)
		{
			String str = sc.nextLine();
			str=str.replace(" ","");
			for(int j=0 ; j<C ; j++)
			{
				grid[row][j]=str.charAt(j);
				if(grid[row][j]=='R')
				{
					rab_pos = new int[]{row,j,0};
				}
			}
		}
		System.out.println(bfs(grid, rab_pos, R, C));
	}
}

/*
import java.util.*;

public class Main {

    private static final int[][] DIRECTIONS = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}}; // Down, Up, Right, Left

    public static int findShortestPath(char[][] grid, int[] startPosition, int rows, int cols) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(startPosition);

        boolean[][] visited = new boolean[rows][cols];
        visited[startPosition[0]][startPosition[1]] = true;

        int steps = 0;

        while (!queue.isEmpty()) {
            steps++;
            int levelSize = queue.size();

            for (int i = 0; i < levelSize; i++) {
                int[] current = queue.poll();

                if (grid[current[0]][current[1]] == 'C') {
                    return steps -1; // Found at the previous step's expansion
                }

                for (int[] dir : DIRECTIONS) {
                    int nextRow = current[0] + dir[0];
                    int nextCol = current[1] + dir[1];

                    if (nextRow < 0 || nextRow >= rows || nextCol < 0 || nextCol >= cols ||
                        grid[nextRow][nextCol] == '#' || visited[nextRow][nextCol]) {
                        continue;
                    }

                    if (grid[nextRow][nextCol] == 'C') {
                        return steps;
                    }

                    visited[nextRow][nextCol] = true;
                    queue.offer(new int[]{nextRow, nextCol});
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline
        int[] startPosition = new int[2];
        char[][] grid = new char[r][c];
        for (int i = 0; i < r; i++) {
            String line = sc.nextLine();
            line = line.replace(" ","");
            grid[i] = line.toCharArray();
            if (line.indexOf('R') != -1) 
				startPosition = new int[]{i, line.indexOf('R')};
        }
        System.out.println(findShortestPath(grid, startPosition, r, c));
    }
}
*/