package dictionary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary {

    private Map<String, Set<String>> dictionary;

    public PersonalMultipleEntryDictionary(){
        this.dictionary = new HashMap<>();
    }

    public void add(String word, String entry){
        if(!dictionary.containsKey(word)){
            dictionary.put(word, new HashSet<>());
        }

        dictionary.get(word).add(entry);
    }

    public Set<String> translate(String word){
        if(!dictionary.containsKey(word)){
            dictionary.put(word, new HashSet<>());
        }

        Set<String> translations = dictionary.get(word);
        if(translations.isEmpty()){
            return null;
        }

        return translations;
    }

    public void remove(String word){
        dictionary.remove(word);
    }

}
