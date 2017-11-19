package boxes;

import java.util.ArrayList;
import java.util.List;

public class MaxWeightBox extends Box{

    private int maxWeight;
    private List<Thing> box;

    public MaxWeightBox(int maxWeight){
        super();
        this.maxWeight = maxWeight;
        box = new ArrayList<>();
    }

    public void add(Thing thing){
        int boxWeight = 0;

        for(Thing t : box){
            boxWeight += t.getWeight();
        }

        if (boxWeight + thing.getWeight() <= maxWeight){
            box.add(thing);
        }
    }

    public boolean isInTheBox(Thing thing){
        return box.contains(thing);
    }


}
