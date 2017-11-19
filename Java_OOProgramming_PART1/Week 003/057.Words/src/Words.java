import java.util.ArrayList;
import java.util.Scanner;

public class Words {

    /*
        The program asks the user to input words until the user types in an empty String.
         Then the program prints the words the user gave. It is required to use an ArrayList.
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
                break;
            }
        }

        for (String word : words) {
            System.out.println(word);
        }
    }
}
