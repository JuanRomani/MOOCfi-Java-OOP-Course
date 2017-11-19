import java.util.HashMap;

public class Plane {

    private HashMap<String, String> planes;

    public Plane(){
        planes = new HashMap<>();
    }

    public void addPlane(String ID, String capacity){
        planes.put(ID, capacity);
        printPlaneInfo(ID);
    }


    public String printPlaneInfo(String plane){
        return plane + " (" + planes.get(plane) + " ppl)";
    }

    public void printAllPlanes(){
        for (String item : planes.keySet()){
            System.out.println(printPlaneInfo(item));
        }
    }

    public boolean checkPlaneExistence(String plane){
        return planes.containsKey(plane);
    }

}
