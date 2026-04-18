import java.util.*;

public class Seats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            ArrayList<Integer> gaps = new ArrayList<>();
            int ind = 0;
            int gap = 0;
            int Ones = 0;
            int lenList = 0;
            int addedOnes = 0;
            for(int i=0;i<n;i++){
                if(s.charAt(i) == '1') Ones++;
            }
            // If all values are zero
            if(Ones == 0){
                System.out.println((n+2)/3);
            }
            // If there exist Ones
            else{
                // finds the gaps
                while(ind < n){
                    if(s.charAt(ind) == '1'){
                        gaps.add(gap);
                        lenList++;
                        gap = 0;
                        ind++;
                        continue;
                    }
                    else{
                        gap++;
                        ind++;
                    }
                }
                gaps.add(gap);
                lenList++;
                for(int i=0;i<lenList;i++){
                    // end and beg cases
                    if(i == 0 || i == lenList-1) addedOnes += ((gaps.get(i)+1)/3);
                    // mid cases
                    else addedOnes += gaps.get(i)/3;
                }
                // answer added ones and existing ones
                /*for(int i=0;i<lenList;i++){
                    System.out.print(gaps.get(i) + " ");
                }*/
                //System.out.println();
                //System.out.println(lenList);
                System.out.println(addedOnes + Ones);
            }
        }
    }
}