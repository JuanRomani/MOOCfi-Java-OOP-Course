package file;

import java.io.File;
import java.util.Scanner;

public class Analysis {

    private File file;

    public Analysis(File file){
        this.file = file;
    }

    public int lines() throws Exception {
        int lines = 0;
        Scanner reader = new Scanner(this.file);

        while(reader.hasNextLine()){
            reader.nextLine();
            lines++;
        }

        return lines;
    }

    public int characters() throws Exception {
        int characters = 0;
        Scanner reader = new Scanner(file);

        while(reader.hasNext()){
            String whole = reader.nextLine();
            characters += whole.length();
        }

        characters += lines();

        return characters;
    }
}
