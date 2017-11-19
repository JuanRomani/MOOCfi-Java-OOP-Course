import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {

        //Ask for two numbers, check if they are equal or what one is the greater

        Scanner reader = new Scanner(System.in);

        System.out.println("Type the first number:");
        int num1 = Integer.parseInt(reader.nextLine());

        System.out.println("Type the second number:");
        int num2 = Integer.parseInt(reader.nextLine());

        if (num1 == num2) {
            System.out.println("The numbers are equal");
        } else {
            System.out.println("Greater number: " + Math.max(num1, num2));
        }
    }
}
