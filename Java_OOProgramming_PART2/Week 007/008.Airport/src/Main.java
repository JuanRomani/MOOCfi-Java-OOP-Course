
public class Main {
    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be useful.

        Plane planes = new Plane();
        Flight flights = new Flight();
        Reader readers = new Reader();

        AirportPanel inter = new AirportPanel(planes, flights, readers);

        inter.startAirportPanel();


    }
}
