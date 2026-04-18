import java.util.*;

public class disjointMat{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int disj[] = new int[10];
        for(int i=0;i<10;i++){
            disj[i] = i;
        }
        while(n-- > 0){
            int lt = sc.nextInt();
            int rt = sc.nextInt();
            disj[findldr(disj,rt)] = findldr(disj,lt);
        }
    }
    
    private static int findldr(int[] ldr, int node){
        if(node == ldr[node]) return node;
        ldr[node] = findldr(ldr, ldr[node]);
        return ldr[node];
    }
}