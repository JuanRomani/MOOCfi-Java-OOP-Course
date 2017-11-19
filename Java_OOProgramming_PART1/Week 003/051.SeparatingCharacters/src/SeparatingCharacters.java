
import java.util.Scanner;

public class SeparatingCharacters {

    // The program ask for a string and then print every character, without using methods.

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type your name:");
        String name = reader.nextLine();

        int e = 0;
        while (e < name.length()) {
            System.out.println(e+1 + ". character: " + name.charAt(e));
            e++;
        }
    }

}
