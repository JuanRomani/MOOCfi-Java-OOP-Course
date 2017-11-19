
package dictionary;

/**
 * No mio
 * autor giuseppedesantis
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class MindfulDictionary {
    private HashMap<String, String> dictionaryFromLangA;
    private HashMap<String, String> dictionaryFromLangB;
    private Scanner reader;
    private FileWriter writer;
    private File file;

    public MindfulDictionary(){
        dictionaryFromLangA = new HashMap<String, String>();
        dictionaryFromLangB = new HashMap<String, String>();
    }

    public MindfulDictionary(String file) throws FileNotFoundException, IOException{
        dictionaryFromLangA = new HashMap<String, String>();
        dictionaryFromLangB = new HashMap<String, String>();
        this.file = new File(file);

        try{
            reader = new Scanner(this.file);
        }
        catch (FileNotFoundException e){
            System.out.println("file not found");
        }
    }

    public boolean load(){
        if(!reader.hasNextLine()){
            return false;
        }else{
            while(reader.hasNextLine()){
                String line = reader.nextLine();
                String [] parts = line.split(":");

                dictionaryFromLangA.put(parts[0], parts[1]);
                dictionaryFromLangB.put(parts[1], parts[0]);
            }

            return true;
        }
    }

    public boolean save(){
        try{
            writer = new FileWriter(file);
            for(String a : dictionaryFromLangA.keySet()){
                String line = a + ":" + dictionaryFromLangA.get(a) + "\n";
                writer.write(line);
            }
            writer.close();
        }catch (IOException e){
            return false;
        }

        return true;
    }

    public void add(String word, String translation){
        if(!dictionaryFromLangA.containsKey(word) && !dictionaryFromLangB.containsKey(translation)){
            dictionaryFromLangA.put(word, translation);
            dictionaryFromLangB.put(translation, word);
        }
    }

    public String translate(String word){
        if(dictionaryFromLangA.containsKey(word)){
            return dictionaryFromLangA.get(word);
        }else if(dictionaryFromLangB.containsKey(word)){
            return dictionaryFromLangB.get(word);
        }else{
            return null;
        }
    }

    public void remove(String word){
        if(dictionaryFromLangA.containsKey(word)){
            dictionaryFromLangA.remove(word);
            String key = getKeyByValue(dictionaryFromLangB, word);

            dictionaryFromLangB.remove(key);
        }else if(dictionaryFromLangB.containsKey(word)){
            dictionaryFromLangB.remove(word);
            String key = getKeyByValue(dictionaryFromLangA, word);

            dictionaryFromLangA.remove(key);
        }
    }

    public <T, E> T getKeyByValue(Map<T, E> map, E value) {
        for (Map.Entry<T, E> entry : map.entrySet()) {
            if (value.equals(entry.getValue())) {
                return entry.getKey();
            }
        }

        return null;
    }
}
