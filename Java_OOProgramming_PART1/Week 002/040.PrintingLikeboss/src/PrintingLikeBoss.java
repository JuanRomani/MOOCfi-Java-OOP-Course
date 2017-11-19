public class PrintingLikeBoss {

    // More printing using methods and parameters

    public static void printStars(int amount) {
        // Star printer

        int i = 0;
        while (i < amount) {
            System.out.print("*");
            i++;
        }

        System.out.print("\n");
    }

    public static void printWhitespaces(int amount) {
        // 40.1 - Prints white spaces

        int i = 0;
        while (i < amount) {
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int size) {
        // 40.2 - Prints a (right aligned) triangle, using the white spaces printer method too

        int i = 1;
        while (i <= size){
            printWhitespaces(size - i); // Amount of spaces equals to size - amount of stars (i)
            printStars(i); // Prints the star
            i++;
        }
    }

    public static void xmasTree(int height) {
        // 40.3 - Prints a Christmas tree

        // triangle
        int i = 1;
        int e = 1;
        int h = height;

        while (e <= h) {
            printWhitespaces(h-=e);
            printStars(i);
            i += 2;
        }

        //base
        int f = 0;

        while (f < 2) {
            printWhitespaces(height - 2);
            printStars(3);
            f++;
        }
    }

    public static void main(String[] args) {
        printWhitespaces(5);

        System.out.println("---");

        printStars(5);

        System.out.println("---");

        printTriangle(4);

        System.out.println("---");

        xmasTree(3);

        System.out.println("---");

        xmasTree(10);
    }
}
