import java.util.ArrayList;
import java.util.Scanner;

public class BirdDatabase {

    private ArrayList<Bird> database;
    private Scanner scanner;

    public BirdDatabase(Scanner scanner){
        this.database = new ArrayList<>();
        this.scanner = scanner;
    }

    public void add(){
        System.out.println("Name:");
        String name = scanner.nextLine();

        System.out.println("Latin name:");
        String latinName = scanner.nextLine();

        Bird bird = new Bird(name, latinName);

        this.database.add(bird);
    }

    public void observed(){
        System.out.println("What was observed:?");
        String birdObserved = scanner.nextLine();

        for (Bird bird : database){
            if(bird.getName().equals(birdObserved)){
                bird.setTimesWatched();
                return;
            }
        }

        System.out.println("Is not a bird!");

    }

    public void statics(){
        for (Bird bird : database){
            System.out.println(bird.getName()+" ("+bird.getLatinName()+"): "+bird.getTimesWatched()+" observations");
        }
    }

    public void show(){
        System.out.println("What?");
        String show = scanner.nextLine();

        for (Bird bird : database){
            String name = bird.getName();

            if(name.equals(show)){
                System.out.println(bird.getName()+" ("+bird.getLatinName()+"): "+bird.getTimesWatched()+" observations");
            }
        }
    }

}
