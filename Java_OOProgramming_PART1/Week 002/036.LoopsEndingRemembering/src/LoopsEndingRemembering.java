import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {

        /*
        1. The program asks for numbers until the input it is "-1"
        2. The program prints the sum of the numbers
        3. The program prints how many numbers have been entered too
        4. The program calculates the average of the given numbers
        5. The program tells how many odd / even numbers have been given
        */
        
        Scanner reader = new Scanner(System.in);

        System.out.println("Type numbers:");

        int sum = 0;
        int i = 0;
        double avg = 0;
        int e = 0;
        int o = 0;

        while (true) {
            int num = Integer.parseInt(reader.nextLine()); // Asks for numbers
            if (num == -1) { // If user input equals -1, loop ends
                break;
            } else {
                sum += num; // Sum of the numbers

                i++; // Tells how many numbers have been entered

                avg = (double)sum / i; // Calculates the average of the given numbers

                if (num % 2 == 0){ // Tells if the number is even...
                    e++;
                } else { // ... or if its odd
                    o++;
                }
            }
        }

        // Then prints every result

        System.out.println("Thank you and see you later!");

        System.out.println("The sum is " + sum);

        System.out.println("How many numbers " + i);

        System.out.println("Average: " + avg);

        System.out.println("Even numbers: " + e);

        System.out.println("Odd numbers: " + o);

    }
}
