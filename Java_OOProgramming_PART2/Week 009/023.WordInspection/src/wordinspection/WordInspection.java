package wordinspection;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordInspection {

    private File file;
    private Scanner reader;

    public WordInspection(File file) throws Exception {
        this.file = file;
        this.reader = new Scanner(this.file, "UTF-8");
    }

    public int wordCount() throws Exception {
        int words = 0;

        while(reader.hasNext()){
            reader.nextLine();
            words++;
        }

        return words;
    }

    public List<String> wordsContainingZ() throws Exception {
        List<String> wordsContainingZ = new ArrayList<>();

        while(reader.hasNext()){
            String word = reader.nextLine();

            if(word.contains("z")){
                wordsContainingZ.add(word);
            }
        }

        return wordsContainingZ;
    }

    public List<String> wordsEndingInL() throws Exception {
        List<String> wordsEndingInL = new ArrayList<>();

        while(reader.hasNext()){
            String word = reader.next();

            if(word.endsWith("l")){
                wordsEndingInL.add(word);
            }
        }

        return wordsEndingInL;
    }

    public List<String> palindromes(){
        List<String> palindromes = new ArrayList<>();

        while(reader.hasNext()){
            String word = reader.next();
            String reverse = "";

            for (int i = 1; i <= word.length(); i++){
                reverse = reverse + word.charAt(word.length() - i);
            }
            if(word.equals(reverse)){
                palindromes.add(reverse);
            }
        }

        return palindromes;
    }

    public List<String> wordsWhichContainAllVowels(){
        List<String> containAllVowels = new ArrayList<>();
        String[] list = {"a", "e", "i", "o", "u", "y", "ä", "ö"};

        while(reader.hasNext()){
            String word = reader.next();
            int count = 0;

            for (String character : list){
                if(word.contains(character)){
                    count++;
                }
            }
            if(count == list.length){
                containAllVowels.add(word);
            }
        }

        return containAllVowels;
    }
}
