
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {

        //Program asks for three numbers, then prints out the sum

        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read; // store numbers read form user only in this variable

        System.out.println("Type the first number:");
        read = Integer.parseInt(reader.nextLine());

        System.out.println("Type the second number:");
        read = read + Integer.parseInt(reader.nextLine());

        System.out.println("Type the third number:");
        sum = read + Integer.parseInt(reader.nextLine());

        System.out.println("Sum: " + sum);
    }
}
