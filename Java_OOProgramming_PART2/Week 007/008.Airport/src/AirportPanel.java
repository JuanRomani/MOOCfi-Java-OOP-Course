public class AirportPanel {

    private Plane plane;
    private Flight flight;
    private Reader reader;

    public AirportPanel(Plane plane, Flight flight, Reader reader){
        this.plane = plane;
        this.flight = flight;
        this.reader = reader;
    }

    public void startAirportPanel(){

        System.out.println("Airport panel\n--------------------\n");

        while (true){
            System.out.println("Choose operation:\n" +
                    "[1] Add airplane\n[2] Add flight\n[x] Exit");
            System.out.print("> ");
            String input = reader.readString();

            if (input.equals("1")){
                addPlaneToHashMap();
            } else if (input.equals("2")){
                addFlightToArrayList();
            } else if (input.equals("x")){
                break;
            }
        }

        startFlightService();
    }

    public void addPlaneToHashMap(){
        System.out.print("Give plane ID: ");
        String ID = reader.readString();

        System.out.print("Give plane capacity: ");
        String capacity = reader.readString();

        plane.addPlane(ID, capacity);
    }

    public void addFlightToArrayList(){

        System.out.print("Give plane ID: ");
        String planeID = reader.readString();

        System.out.print("Give departure airport code: ");
        String origin = reader.readString();

        System.out.print("Give destination airport code: ");
        String destiny = reader.readString();

        if(plane.checkPlaneExistence(planeID)){
            String planeInfo = plane.printPlaneInfo(planeID);
            flight.addFlight(planeInfo, origin, destiny);
        }

    }


    public void startFlightService(){
        System.out.println("Flight service\n------------\n");

        while (true){
            System.out.println("Choose operation: \n" +
                    "[1] Print planes\n[2] Print flights\n[3] Print plane info\n[x] Quit");
            System.out.print("> ");
            String input = reader.readString();

            if (input.equals("1")){
                plane.printAllPlanes();
            } else if (input.equals("2")){
                flight.printFlights();
            } else if (input.equals("3")){
                System.out.print("Give plane ID: ");
                String planeID = reader.readString();

                System.out.println(plane.printPlaneInfo(planeID));
            } else if (input.equals("x")){
                break;
            }
        }
    }

}
