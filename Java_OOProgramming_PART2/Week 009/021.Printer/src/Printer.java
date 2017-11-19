import java.io.File;
import java.util.Scanner;

public class Printer {

    private File file;

    public Printer(String filename) throws Exception {
        this.file = new File(filename);
    }

    public void printLinesWhichContain(String word) throws Exception {
        Scanner reader = new Scanner(file);

        while(reader.hasNext()){
            String line = reader.nextLine();

            if(line.contains(word)){
                System.out.println(line);
            }
        }

        reader.close();
    }
}
