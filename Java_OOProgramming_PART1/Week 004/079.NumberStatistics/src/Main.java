import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // Write test code here
        // Remember to remove all the extra code when doing assignments  79.3 and 79.4

        // Define three NumberStatistics objects in your program:
        // The first is used to track the sum of all given numbers.
        // The second takes care of even numbers and the third the odd numbers.

        // The tests does not work if you do not create the objects in the correct order

        NumberStatistics sum = new NumberStatistics();
        NumberStatistics sumEven = new NumberStatistics();
        NumberStatistics sumOdd = new NumberStatistics();

        System.out.println("Type numbers:");

        while (true) {
            int num = Integer.parseInt(reader.nextLine());
            if (!(num < 0)) {
                sum.addNumber(num);
                if (num % 2 == 0) {
                    sumEven.addNumber(num);
                } else {
                    sumOdd.addNumber(num);
                }
            } else {
                break;
            }
        }

        System.out.println("sum: " + sum.sum());
        System.out.println("sum of even: " + sumEven.sum());
        System.out.println("sum of odd: " + sumOdd.sum());

    }
}
