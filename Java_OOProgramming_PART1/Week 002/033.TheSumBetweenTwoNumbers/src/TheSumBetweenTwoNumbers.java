
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {

        // The program ask for two numbers and then sum every number between them
        // Example: num1 = 3 | num2 = 5 | sum = 3+4+5 = 12

        Scanner reader = new Scanner(System.in);

        System.out.println("First:");
        int num1 = Integer.parseInt(reader.nextLine());

        System.out.println("Second");
        int num2 = Integer.parseInt(reader.nextLine());

        int sum = 0;

        while(num1 <= num2) {
            sum += num1;
            num1++;
            System.out.println(sum);
        }
        System.out.println("The sum is " + sum);
    }
}
