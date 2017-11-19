import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        Scanner reader = new Scanner(System.in);

        BirdDatabase database = new BirdDatabase(reader);

        while(true){
            System.out.println("?");
            String input = reader.nextLine();

            if (input.equals("Add")){
                database.add();
            }else if(input.equals("Statistics")){
                database.statics();
            } else if(input.equals("Observation")){
                database.observed();
            } else if(input.equals("Show")){
                database.show();
            } else if(input.equals("Quit")){
                break;
            }
        }
    }

}
