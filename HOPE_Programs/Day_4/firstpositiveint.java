package Day_4;
import java.util.*;

public class firstpositiveint {
    public static void main(String[] args) {
        int arr1[] = {3,4,-1,1};
        int arr2[] = {1,5,3,9};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i=0;
        while(arr1[i]<=0){
            i++;
        }
        int j = 1;
        while(j<Integer.MAX_VALUE){
            if(j==arr1[i]){
                j++;
                i++;
            }
            else{
                System.out.println("num: " + j);
                break;
            }
        }
    }
}


