import javax.swing.*;

public class launcher {
    private static boolean running;
    public static void main(String[] args) {
        /*Main gui = new Main();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(800,640);
        gui.setVisible(true);
        gui.setTitle("Prime Number Calculator");*/

        running = true;
        //while(running){
        prime prime = new prime(10000);
        //}
        //Main Main = new Main();
    }
    public static void stop(){
        running = false;
    }
}
