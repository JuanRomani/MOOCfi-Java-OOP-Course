public class Printing {

    // Using methods with parameters

    public static void printStars(int amount) {
        // 39.1 - Star printer

        int i = 0;
        while (i < amount) {
            System.out.print("*");
            i++;
        }
        System.out.print("\n");

    }

    public static void printSquare(int sideSize) {
        // 39.2 - Prints a square

        int i = 0;
        while (i < sideSize) {
            printStars(sideSize);
            i++;
        }
    }

    public static void printRectangle(int width, int height) {
        // 39.3 - Prints a rectangle

        int i = 0;
        while (i < height) {
            printStars(width);
            i++;
        }
    }

    public static void printTriangle(int size) {
        // 39.4 - Prints a (left aligned) triangle

        int i = 1;
        while (i <= size) {
            printStars(i);
            i++;
        }
    }

    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);

        System.out.println("\n---");  // printing --- to separate the figures. "\n" equals to line break
        printSquare(4);
        System.out.println("\n---");
        printRectangle(17, 3);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

}
