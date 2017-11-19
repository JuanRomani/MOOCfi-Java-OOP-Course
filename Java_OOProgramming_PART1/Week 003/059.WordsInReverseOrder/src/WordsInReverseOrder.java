import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {

    /*
        The program asks the user to input strings until he input an empty string. Then prints the
         given words in reverse order.
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
                Collections.reverse(words); // To reverse the contents of the ArrayList object
                break;
            }
        }

        for (String word : words) {
            System.out.println(word);
        }

    }
}
