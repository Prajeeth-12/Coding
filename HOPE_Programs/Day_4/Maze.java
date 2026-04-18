package Day_4;
import java.util.*;

public class Maze {
    public static void main(String[] args) {
        char maze[][] = {{'+','+','.','+'},{'.','.','.','+'},{'+','+','+','.'}};
        int ent[] = {1,2};
        int r = maze.length;
        int c = maze[0].length;

        Queue<int[]> queue = new LinkedList<>();

        maze[ent[0]][ent[1]] = '+';
        queue.offer(ent);
        int dirs[][] = {{1,0},{0,1},{0,-1},{-1,0}};
        int steps = 0;
        
        while(!queue.isEmpty()){
            steps++;

            int n = queue.size();
            int x;
            int y;
            for(int i=0;i<n;i++){
                int pos[] = queue.poll();
                for(int[] dir : dirs){
                    x = pos[0] + dir[0];
                    y = pos[1] + dir[1];

                    if(x<0 || x>=r || y<0 || y>=c) continue;

                    if(maze[x][y] == '+') continue;

                    if(x==0 || y==0 || x==r-1 || y==c-1) {
                        System.out.print(steps);
                        break;
                    }

                    maze[x][y] = '+';
                    queue.offer(new int[] {x,y});

                }
            }
        }
    }
}
