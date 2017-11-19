import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Thing> things;
    private int weightLimit;

    public Suitcase(int limit){
        this.things = new ArrayList<Thing>();
        this.weightLimit = limit;
    }

    public int amount(){
        int amount = 0;

        for (Thing object : things){
            amount++;
        }

        return amount;
    }

    public int load(){
        int load = 0;

        for (Thing object : things){
            load += object.getWeight();
        }

        return load;
    }

    public void addThing(Thing thing){
        if(load() + thing.getWeight() <= this.weightLimit){
            things.add(thing);
            amount();
            load();
        }
    }

    public String toString(){
        if(amount() == 0){
            return "empty (" + load() + " kg)";
        } else if (amount() == 1){
            return amount() + " thing (" + load() + " kg)";
        }

        return amount() + " things (" + load() + " kg)";
    }

    public Thing heaviestThing(){
        Thing temp = new Thing("null", 0);

        if (things.size() > 0){
            for (Thing object : things){
                if (object.getWeight() > temp.getWeight()){
                    temp = object;
                }
            }
            return temp;
        }

        return null;
    }


    public void printThings(){
        for (Thing object : this.things){
            System.out.println(object.toString());
        }
    }

    public int totalWeight(){
        return this.load();
    }
}
