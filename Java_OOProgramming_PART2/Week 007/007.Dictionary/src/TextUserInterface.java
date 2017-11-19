import java.util.Scanner;

public class TextUserInterface {

    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary){
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void start(){
        System.out.println("Statements: ");
        System.out.println("add - adds a word pair to the dictionary \n" +
                "translate - asks a word and prints its translation \n" +
                "quit - quit the text user interface \n");

        while(true){
            System.out.print("Statement: ");
            String input = reader.nextLine();

            if(input.equals("quit")){
                System.out.println("Cheers!");
                break;
            } else if (input.equals("translate")){
                translation();
            } else if (input.equals("add")){
                add();
            } else {
                System.out.println("Unknown statement");
            }

        }
    }

    public void add(){
        System.out.print("In Finnish: " );
        String word = reader.nextLine();

        System.out.print("Translation: ");
        String translation = reader.nextLine();

        dictionary.add(word, translation);
    }

    public void translation(){
        System.out.print("Give a word: ");
        String word = reader.nextLine();

        System.out.println("Translation: " + dictionary.translate(word));
    }
}
