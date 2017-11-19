import java.util.ArrayList;

public class Flight {

    private ArrayList<String> flights;

    public Flight(){
        this.flights = new ArrayList<>();
    }

   public void addFlight(String plane, String origin, String destiny){
        String flight = plane + " (" + origin + "-" + destiny + ")";
        flights.add(flight);
   }

    public void printFlights(){
        for (String flights : flights){
            System.out.println(flights);
        }
    }

}
