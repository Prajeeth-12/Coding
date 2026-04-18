import java.util.Scanner;

class wordSearch8dir {
    public static void Main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        char[][] board=new char[N][M];
        for(int i=0;i<N;i++){
            String s=sc.next();
            for(int j=0;j<M;j++)
            {
                board[i][j]=s.charAt(j);
            }
        }
        String word=sc.next();
        System.out.println(new wordSearch8dir().exist(board,word));
    }
    private boolean dfs(int i,int j,char[][] board,int index,String words)
    {
        if(index==words.length())
        return true;
        if(i<0 || i>=board.length || j<0 || j>=board[0].length || words.charAt(index)!=board[i][j])
        return false;
    
        char ch=board[i][j];
        board[i][j]='.';
        boolean f=dfs(i+1,j,board,index+1,words) || dfs(i,j+1,board,index+1,words) || dfs(i-1,j,board,index+1,words) || dfs(i,j-1,board,index+1,words) || dfs(i-1,j-1,board,index+1,words) || dfs(i-1,j+1,board,index+1,words) || dfs(i+1,j-1,board,index+1,words) || dfs(i+1,j+1,board,index+1,words);
        board[i][j]=ch;
        return f;
    }

    public boolean exist(char[][] board, String word) {
        int N=board.length;
        int M=board[0].length;
        boolean k=false;
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<M;j++)
            {
                if(board[i][j]==word.charAt(0))
                {
                    k=dfs(i,j,board,0,word);
                }
                if(k)
                {
                    return true;
                }
            }
        }
        return false;
    }
}