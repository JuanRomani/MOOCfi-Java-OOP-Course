import java.util.ArrayList;

public class Box implements ToBeStored{

    private double maxWeight;
    private ArrayList<ToBeStored> things;
    private int amount;

    public Box(double maxWeight){
        this.maxWeight = maxWeight;
        this.things = new ArrayList<>();
    }

    public void add(ToBeStored toBeStored){
        if (toBeStored.weight() + weight() < maxWeight){
            things.add(toBeStored);
            amount++;
            weight();
        }
    }

    public double weight(){
        double weight = 0;

        for (ToBeStored thing : things){
            weight += thing.weight();
        }

        return weight;
    }

    @Override
    public String toString() {
        return "Box: " + amount + " things, total weight " + weight() + " kg";
    }
}
