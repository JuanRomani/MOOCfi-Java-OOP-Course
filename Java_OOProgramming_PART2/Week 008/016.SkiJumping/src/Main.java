
public class Main {

    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be very useful.

        Reader reader = new Reader();
        UI ui = new UI(reader);

        ui.start();
    }

}
