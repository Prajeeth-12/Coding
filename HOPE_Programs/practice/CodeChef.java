import java.lang.*;
import java.util.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    
		    for(int i=0;i<n;i++){
		        arr[i] = sc.nextInt();
		    }

		    int temp[] = new int[n];
		    
		    for(int i=0;i<n;i++){
		        temp[i] = arr[i];
		    }
		    
		    int f = 0;
		    
		    for(int i=0;i<n;i++){
		        
		        if(eqlArray(arr)){
		            f = 1;
		            break;
		        }
		        
		        for(int j=0;j<n;j++){
		            if(j<i){
		                arr[j] = temp[j] + temp[i];
		            }
		            else{
		                arr[j] = temp[j] - temp[i];
		            }
		        }
                for(int k : arr){
                    System.out.print(k + " ");
                }
                System.out.println();
		    }
            if(eqlArray(arr)) f = 1;
		    if(f == 1) System.out.println("Yes");
		    else System.out.println("No");
		}

	}
	
	private static boolean eqlArray(int arr[]){
	    int k = arr[0];
	    for(int i=0;i<arr.length;i++){
	        if(k != arr[i]) return false;
	    }
	    return true;
	}
}
