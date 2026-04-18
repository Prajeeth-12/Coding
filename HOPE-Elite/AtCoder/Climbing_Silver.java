public class ABC_443_ E - Climbing Silver {
    import java.util.*;
public class Main{
  static int coldiff[]={0,-1,1};
  static int rowdiff[]={-1,-1,-1};
  public static void main(String[]args)
  {
    Scanner scan=new Scanner(System.in);
    int t=scan.nextInt();
    while(t-- >0)
    {
      int n=scan.nextInt();
      int c=scan.nextInt();
      scan.nextLine();
      char mat[][]=new char[n][n];
      for(int i=0;i<n;i++)
      {
         String s=scan.nextLine();
         char ch[]=s.toCharArray();
         mat[i]=ch;
      }
      boolean dp[][]=new boolean[n][n];
      boolean poss[][]=new boolean[n][n];
      for(int i=0;i<n;i++)
      {
         if(mat[n-1][i]=='.')
         {
           poss[n-1][i]=true;
         }
      }
      for(int i=n-2;i>=0;i--)
      {
        for(int j=0;j<n;j++)
        {
           if(mat[i][j]=='.' && poss[i+1][j])
           {
              poss[i][j]=true;
           }
        }
      }
      dp[n-1][c-1]=true;
      for(int i=n-1;i>=0;i--)
      {
        for(int j=0;j<n;j++)
        {
          if(!dp[i][j])
          {
            continue;
          }
            for(int k=0;k<3;k++)
            {
              int rc=i+rowdiff[k];
              int cc=j+coldiff[k];
              if(rc>=0 && rc<n & cc>=0 && cc<n)
              {
                if(mat[rc][cc]=='.')
                {
                  dp[rc][cc]=true;
                  if(poss[i][cc] && !poss[rc][cc])
                  {
                    poss[rc][cc]=true;
                  }
                }
                else{
                  if(poss[i][cc])
                  {
                    dp[rc][cc]=true;
                    poss[rc][cc]=true;
                  }
                }
              }
            }
        }
      }
      StringBuilder sb=new StringBuilder();
      for(int i=0;i<n;i++)
      {
        if(dp[0][i])
        {
          sb.append("1");
        }
        else{
          sb.append("0");
        }
      }
      System.out.println(sb.toString());
    }
}
}
}
