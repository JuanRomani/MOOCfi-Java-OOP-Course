import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        
        //The program ask for a number and then calculates the factorial
        
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number:");
        int num = Integer.parseInt(reader.nextLine());
        
        int flag = 1;
        int fac = 1;

        while (flag <= num) {
            fac *= flag;
            flag++;
        }

        System.out.println("Factorial is " + fac);
    }
}
