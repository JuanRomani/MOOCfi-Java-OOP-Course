import java.util.Scanner;

public class Reader {

    private Scanner reader;

    public Reader(){
        reader = new Scanner(System.in);
    }

    public String readString(){
        return reader.nextLine();
    }

}
