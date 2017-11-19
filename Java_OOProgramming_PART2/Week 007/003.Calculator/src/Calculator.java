
public class Calculator {

    private Reader reader;
    private int stats;

    public Calculator(){
        reader = new Reader();
        stats = 0;
    }

    private void sum(){
        System.out.println("Value1: ");
        int num1 = reader.readInteger();
        System.out.println("Value2: ");
        int num2 = reader.readInteger();

        System.out.println("Sum of the values " + Math.addExact(num1, num2));
        stats++;
    }

    private void difference(){
        System.out.println("Value1: ");
        int num1 = reader.readInteger();
        System.out.println("Value2: ");
        int num2 = reader.readInteger();

        System.out.println("difference of the values " + Math.subtractExact(num1, num2));
        stats++;
    }

    private void product(){
        System.out.println("Value1: ");
        int num1 = reader.readInteger();
        System.out.println("Value2: ");
        int num2 = reader.readInteger();

        System.out.println("Product of the values " + Math.multiplyExact(num1, num2));
        stats++;
    }

    private void statistics(){
        System.out.println("Calculations done " + stats);
    }

    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();

            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }

        statistics();
    }
}
