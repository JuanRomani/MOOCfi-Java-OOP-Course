
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    /*
        The program asks the user to input words until the user repeats one of the words.
         This program requires the use of an ArrayList object.
     */

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();

        while (true) {
            System.out.println("Type a word:");
            String word = reader.nextLine();

            if (!(words.contains(word))) { //If the ArrayList does not contain the given word
                words.add(word);
            } else {
                System.out.println("You gave the word " + word + " twice");
                break;
            }
        }
        
    }
}
