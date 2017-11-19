
import java.util.Scanner;

public class ReversingText {

    /*
        The program asks for a string and then prints it in reverse, using the reverse() method
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type in your text: ");
        String text = reader.nextLine();

        System.out.println("In reverse order: " + reverse(text));
    }

    public static String reverse(String text) {
        String reverse = "";
        int inx = text.length() - 1;

        while (inx >= 0) {
            reverse += text.charAt(inx);
            inx--;
        }

        return reverse;
    }

}