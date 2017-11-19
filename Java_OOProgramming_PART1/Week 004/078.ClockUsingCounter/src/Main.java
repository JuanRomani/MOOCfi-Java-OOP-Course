
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // write here code to ensure that BoundedCounter works as expected
        // before starting 78.3 remove the extra code and use the skeleton shown
        // in the assignment

        BoundedCounter hours = new BoundedCounter(23);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter seconds = new BoundedCounter(59);

        System.out.println("seconds: ");
        int s = Integer.parseInt(reader.nextLine());
        System.out.println("minutes: ");
        int m = Integer.parseInt(reader.nextLine());

        System.out.println("hours: ");
        int h = Integer.parseInt(reader.nextLine());

        seconds.setValue(s);
        minutes.setValue(m);
        hours.setValue(h);

        int i = 0;
        while (i < 121){
            System.out.println(hours + ":" + minutes + ":" + seconds);

            seconds.next();
            if (seconds.getValue() == 0){
                minutes.next();
                if (minutes.getValue() == 0) {
                    hours.next();
                }
            }
            i++;
        }
    }
}