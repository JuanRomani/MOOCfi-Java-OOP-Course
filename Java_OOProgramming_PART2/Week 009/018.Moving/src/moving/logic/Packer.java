package moving.logic;

import moving.domain.Box;
import moving.domain.Thing;

import java.util.ArrayList;
import java.util.List;

public class Packer {

    private int boxesVolume;
    private List<Box> pack;

    public Packer (int boxesVolume){
        this.boxesVolume = boxesVolume;
        this.pack = new ArrayList<>();
    }

    public List<Box> packThings(List<Thing> things){

        for (Thing thing : things){
            Box box = new Box(this.boxesVolume);
            if (thing.getVolume() < this.boxesVolume){
                box.addThing(thing);
                this.pack.add(box);
            }
        }

        return this.pack;
    }
}
