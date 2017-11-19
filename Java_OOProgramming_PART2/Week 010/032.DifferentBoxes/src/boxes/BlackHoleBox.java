package boxes;

import java.util.ArrayList;
import java.util.List;

public class BlackHoleBox extends Box {

    private List<Thing> blackHoleBox;

    public BlackHoleBox(){
        this.blackHoleBox = new ArrayList<>();
    }

    public void add(Thing thing){
        blackHoleBox.add(thing);
        blackHoleBox.clear();
    }

    public boolean isInTheBox(Thing thing){
        return blackHoleBox.contains(thing);
    }
}
