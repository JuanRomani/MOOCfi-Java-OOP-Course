import java.util.Scanner;

public class Reader {

    private Scanner reader = new Scanner(System.in);

    public String readString(){
        return reader.nextLine();
    }

}