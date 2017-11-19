
import java.util.Scanner;

public class FirstPart {

    /* The program asks for a string and the amount of characters the user wants to print,
        starting by the beginning of the word. It uses the substring(beginIndex, endIndex) method
    */

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a word:");
        String word = reader.nextLine();

        System.out.println("Length of the first part:");
        int length = Integer.parseInt(reader.nextLine());

        System.out.println("Result: " + word.substring(0, length));
    }
}
