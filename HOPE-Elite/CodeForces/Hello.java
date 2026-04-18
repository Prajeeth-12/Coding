import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        int r = sc.nextInt();
        int c = sc.nextInt();
        int mat[][] = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            int maxVal = 0, maxIdx = 0;
            for(int j=0;j<c;j++){
                if(mat[i][j] > maxVal){
                    maxVal = mat[i][j];
                    maxIdx = j;
                }
            }
            set.add(maxIdx);
        }
        
        for(int i=0;i<r;i++){
            for(int j : set){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
