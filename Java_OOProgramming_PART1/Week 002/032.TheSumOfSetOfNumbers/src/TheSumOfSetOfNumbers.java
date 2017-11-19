
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {

        //The program calculates the sum 1+2+3+…+n where n is a number entered by the user.

        Scanner reader = new Scanner(System.in);

        System.out.println("Until what?");
        int userNum = Integer.parseInt(reader.nextLine());

        int i = 0;
        int sum = 0;

        while (i <= userNum) {
            sum += i;
            i++;
        }

        System.out.println("Sum is " + sum);

    }
}
