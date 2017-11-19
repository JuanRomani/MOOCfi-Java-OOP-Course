package moving.domain;

import java.util.ArrayList;
import java.util.List;

public class Box implements Thing{

    private int maximumCapacity;
    private List<Thing> box;

    public Box(int maximumCapacity){
        this.maximumCapacity = maximumCapacity;
        box = new ArrayList<>();
    }

    public boolean addThing(Thing thing){
        if (thing.getVolume() + getVolume() <= maximumCapacity){
            box.add(thing);
            return true;
        }

        return false;
    }

    public int getVolume(){
        int volume = 0;

        for (Thing thing : box){
            volume += thing.getVolume();
        }

        return volume;
    }
}
