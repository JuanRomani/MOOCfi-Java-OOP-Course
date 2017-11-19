import java.util.ArrayList;

/**
 * Created by Juan Ignacio on 18/7/2017.
 */
public class Container {

    private int weightLimit;
    private ArrayList<Suitcase> container;

    public Container(int weightLimit){
        this.weightLimit = weightLimit;
        this.container = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase){
        if (load() + suitcase.totalWeight() <= weightLimit){
            container.add(suitcase);
        }
    }

    public int load(){
        int load = 0;

        for (Suitcase suitcase : container){
            load += suitcase.totalWeight();
        }

        return load;
    }

    public String toString(){
        return container.size() + " suitcases (" + load() + " kg)";
    }

    public void printThings(){
        for (Suitcase suitcase : container){
            suitcase.printThings();
        }
    }
}
