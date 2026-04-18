package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HackWithInfyHard {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int N=scan.nextInt();
        int M=scan.nextInt();
        int bonus=scan.nextInt();
        List<int[]> nseries=new ArrayList<>();
        List<int[]>mseries=new ArrayList<>();
        for(int i=0;i<N;i++)
        {
            int texture=scan.nextInt();
            int quality=scan.nextInt();
            nseries.add(i,new int[]{texture,quality});
        }
        for(int i=0;i<M;i++)
        {
            int texture=scan.nextInt();
            int quality=scan.nextInt();
            mseries.add(i,new int[]{texture,quality});
        }
        int dp[][]=new int[N+1][M+1];

        for(int i = 0; i <= N; i++){
            for(int j = 0; j <= M; j++){
                dp[i][j] = -1000000000;
            }
        }
        int maxpts=stitch(mseries,nseries, 0,0,2000,dp,bonus);
        System.out.println(Math.max(maxpts,0));
    }
    static int stitch(List<int[]>mseries,List<int[]>nseries,int nind,int mind,int prevtesture,int [][]dp,int bonus)
    {
        if(dp[nind][mind]!=-1000000000)
        {
            return dp[nind][mind];
        }
        int maxpts=0;
        if(mind<mseries.size())
        {
            int temp[]=mseries.get(mind);
            int nextpts=stitch(mseries,nseries,nind,mind+1,temp[0],dp,bonus);
            int arr[]=mseries.get(mind);
            int currpts=arr[1];
            if(prevtesture==temp[0])
            {
                currpts+=bonus;
            }
            if(nextpts>0)
            {
                currpts+=nextpts;
            }
               maxpts=Math.max(maxpts,currpts);
        }
        if(nind<nseries.size())
        {
            int temp[]=nseries.get(nind);
            int nextpts=stitch(mseries,nseries,nind+1,mind,temp[0],dp,bonus);
            int arr[]=nseries.get(nind);
            int currpts=arr[1];
            if(prevtesture==temp[0])
            {
                currpts+=bonus;
            }
            if(nextpts>0)
            {
                currpts+=nextpts;
            }
                maxpts=Math.max(maxpts,currpts);
        }
        return dp[nind][mind]=maxpts;
    }
}