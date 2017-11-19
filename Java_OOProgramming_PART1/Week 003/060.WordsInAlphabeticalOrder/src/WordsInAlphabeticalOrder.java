
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    /*
        The program asks the user to input strings, until the user gives an empty string.
         Then prints the words in alphabetical order.
     */

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();

        while (true) {
            System.out.println("Type a word:");
            String word = reader.nextLine();

            words.add(word);

            if (word.isEmpty()){
                System.out.println("You typed the following words:");
                Collections.sort(words); // To sort the ArrayList object contents, in this case alphabetically
                break;
            }
        }

        for (String word : words) {
            System.out.println(word);
        }
    }
}
