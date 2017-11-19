public class Main {
    public static void main(String[] args) {
        // write testcode here

        Counter counter = new Counter(10, false);

        counter.decrease(-2);

        System.out.println(counter.value());
    }
}
