import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {

    private HashMap<String, String> dictionary;

    public Dictionary(){
        this.dictionary = new HashMap<>();
    }

    public String translate(String word){
        if (dictionary.containsKey(word)){
            return dictionary.get(word);
        }

        return null;
    }

    public void add(String word, String translation){
        dictionary.put(word, translation);
    }

    public int amountOfWords(){
        int amount = 0;

        for (String word : dictionary.values()){
            amount++;
        }

        return amount;
    }

    public ArrayList<String> translationList(){
        ArrayList<String> list = new ArrayList<>();

        for (String word : dictionary.keySet()){
            list.add(word + " = " + dictionary.get(word));
        }

        return list;
    }
}
