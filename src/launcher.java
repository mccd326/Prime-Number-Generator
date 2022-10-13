
public class launcher {
    private static boolean running;
    public static void main(String[] args) {
        running = true;
        //while(running){
            prime prime = new prime();
        //}
    }
    public static void stop(){
        running = false;
    }
}
