import java.util.Scanner;

public class Palindromi {

    /*
        The program checks if a word is a palindrome. It uses the method reverse to reverse the given
         word and then compares it with the original
     */

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();

        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
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

    public static boolean palindrome(String text) {
        return (text.equals(reverse(text)));
    }
}
