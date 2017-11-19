package tools;

import java.util.HashSet;
import java.util.Set;

public class PersonalDuplicateRemover implements DuplicateRemover {

    private Set<String> remover;
    private int amount = 0;

    public PersonalDuplicateRemover(){
        this.remover = new HashSet<>();
    }

    public void add(String characterString){
        if(remover.contains(characterString)){
            amount++;
        }

        remover.add(characterString);
    }

    public int getNumberOfDetectedDuplicates(){
        return amount;
    }

    public Set<String> getUniqueCharacterStrings(){
        return remover;
    }

    public void empty(){
        remover.clear();
        amount = 0;
    }

}
