public class Worker implements Runnable {
    private int n;
    private int id;

    public Worker(int n,int id) {
        this.n = n;
        this.id = id;
    }

    @Override
    public void run() {
        for(int i=1; i<=n; i++){
            System.out.println(id + " " + i);
        }
    }
}
