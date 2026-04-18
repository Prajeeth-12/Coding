import java.util.*;

public class musicPlayer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Q = sc.nextInt();
        boolean isPlaying = false;
        int volume = 0;
        for(int i=0;i<Q;i++){
            int action = sc.nextInt();
            if(action == 1) volume++;
            if(action == 2){
                if(volume == 0) volume++;
                volume--;
            }
            if(action == 3){
                isPlaying = !isPlaying;
            }
            if(volume >= 3 && isPlaying){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}
