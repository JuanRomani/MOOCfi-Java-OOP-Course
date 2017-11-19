
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {

        //The program calculates the sum of the powers, using 2 as value and the user input as the power
        //Example: userNumber = 3 | Sum = 2^0 + 2^1 + 2^2 + 2^3 = 15

        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number:");
        int pow = Integer.parseInt(reader.nextLine());

        int val = 2;
        int flg = 0;
        int sum = 0;

        while (flg <= pow) {
            sum += (int)Math.pow(val, flg);
            flg++;
        }
        System.out.println("The result is " + sum);
    }
}
