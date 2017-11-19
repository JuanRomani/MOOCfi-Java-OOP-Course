
import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {

        //Asking for a number, then checking if it is even or odd

        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number:");
        int num = Integer.parseInt(reader.nextLine());

        int rem = num % 2; // Getting remainder of given number / 2

        boolean sol = rem == 0; // Checking if remainder it's 0

        if (sol){
            System.out.println("Number " + num + " is even."); // If remainder its 0 = Even
        } else {
            System.out.println("Number " + num + " is odd."); // If not = Odd
        }

    }
}
