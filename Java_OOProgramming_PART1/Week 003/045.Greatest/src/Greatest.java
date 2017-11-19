
public class Greatest {

    // Creation of the method greatest(). The program prints the greatest of the numbers given

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }

    public static int greatest(int number1, int number2, int number3) {

        int num = Math.max(number1, number2);
        int grt = Math.max(number3, num);
        return grt;

    }
}