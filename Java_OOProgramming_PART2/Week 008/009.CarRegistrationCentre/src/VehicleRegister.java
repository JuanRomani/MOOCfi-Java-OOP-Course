import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegister {

    private HashMap<RegistrationPlate, String> vehicleRegistry = new HashMap<>();

    public boolean add(RegistrationPlate plate, String owner){
        if(!(vehicleRegistry.containsKey(plate))){
            vehicleRegistry.put(plate, owner);
            return true;
        }

        return false;
    }

    public String get(RegistrationPlate plate){
        return vehicleRegistry.get(plate);
    }

    public boolean delete(RegistrationPlate plate){
        if(vehicleRegistry.containsKey(plate)){
            vehicleRegistry.remove(plate);
            return true;
        }

        return false;
    }

    public void printRegistrationPlates(){
        for (RegistrationPlate plate : vehicleRegistry.keySet()){
            System.out.println(vehicleRegistry.keySet());
        }
    }

    public void printOwners(){
        ArrayList<String> ownersList = new ArrayList<>();
        String temp = "";

        for (RegistrationPlate plate : vehicleRegistry.keySet()){
            temp = vehicleRegistry.get(plate);

            if (!(ownersList.contains(temp))){
                ownersList.add(temp);
            }
        }

        for (String owner : ownersList){
            System.out.println(owner);
        }
    }

}
