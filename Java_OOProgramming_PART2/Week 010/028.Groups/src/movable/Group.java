package movable;

import java.util.ArrayList;
import java.util.List;

public class Group implements Movable {

    private List<Movable> organismGroup;

    public Group(){
        this.organismGroup = new ArrayList<>();
    }

    public String toString(){
        String group = "";

        for (Movable o : organismGroup){
            group += o.toString() + "\n";
        }

        return group;
    }

    public void addToGroup(Movable movable){
        organismGroup.add(movable);
    }

    public void move(int dx, int dy){
        for(Movable org : organismGroup){
            org.move(dx, dy);
        }
    }
}
