import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt();
		    //int days[] = new int[n];
		    int maxStreak = 0;
		    int streak = 0;
		    for(int i=0;i<n;i++){
		        int day = sc.nextInt();
		        if(day == 0){
		            maxStreak = Math.max(streak,maxStreak);
		            streak = 0;
		        }
		        else{
		            streak++;
		        }
		    }
		    Math.max(streak,maxStreak);
		    System.out.println(maxStreak);

		}

	}
}
