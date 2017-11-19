package Functionality;

import java.util.Scanner;

public class ScannerReader {

    private Scanner reader;

    public ScannerReader(){
        this.reader = new Scanner(System.in);
    }

    public String stringReader(){
        return this.reader.nextLine();
    }
}
