import java.util.Scanner;

public class sumvalmat {
    public static void main(String[] args) {
        int r,c;
        Scanner sc=new Scanner(System.in);
        r = sc.nextInt();
        c = sc.nextInt();
        int a[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int dr[] = {-1, -1, -1, 0, 0, 1, 1, 1};
        int dc[] = {-1, 0, 1, -1, 1, -1, 0, 1};
        int sum=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                for(int k=0;k<8;k++){
                    int ni = i + dr[k];
                    int nj = j + dc[k];
                    if(ni >= 0 && ni < r && nj >= 0 && nj < c){
                        sum += a[ni][nj];
                    }
                }
                System.out.println(sum);
            }
            sum = 0;
        }

    }
}