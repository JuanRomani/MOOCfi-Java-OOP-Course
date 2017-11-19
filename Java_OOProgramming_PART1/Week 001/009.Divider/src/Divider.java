
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {

        // Asking for and reading user input, then calculating quotient

        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number:");
        double num1 = Integer.parseInt(reader.nextLine());

        System.out.println("Type another number:");
        double num2 = Integer.parseInt(reader.nextLine());

        double div = num1 / num2;

        System.out.println("Division:" + num1 + " / " + num2 + " = " + div);

    }
}
