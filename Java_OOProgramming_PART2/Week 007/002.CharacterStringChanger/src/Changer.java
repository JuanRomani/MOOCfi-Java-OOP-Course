import java.util.ArrayList;

public class Changer {

    private ArrayList<Change> changelist;

    public Changer(){
        this.changelist = new ArrayList<>();
    }

    public void addChange(Change change){
        changelist.add(change);
    }

    public String change(String characterString){
        for (Change string : changelist){
            characterString = string.change(characterString);
        }

        return characterString;
    }
}
