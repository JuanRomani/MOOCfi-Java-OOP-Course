
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {

        // The program asks for a limit number and prints every number between 1 and that limit

        Scanner reader = new Scanner(System.in);

        System.out.println("Up to what number?");
        int num = Integer.parseInt(reader.nextLine());

        int flg = 1;

        while (flg <= num) {
            System.out.println(flg);
            flg++;
        }
        
    }
}
