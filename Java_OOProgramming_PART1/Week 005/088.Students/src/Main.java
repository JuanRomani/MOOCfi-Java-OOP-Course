
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();

        while (true){
            System.out.println("name:");
            String name = reader.nextLine();

            if (!(name.equals(""))){
                System.out.println("studentnumber:");
                String studentNumber = reader.nextLine();

                list.add(new Student(name, studentNumber));
            } else {
                for (Student student : list){
                    System.out.println(student);
                }
                break;
            }
        }

        System.out.println("Give search term:");
        String term = reader.nextLine();

        for (Student student : list){
            if (student.getName().contains(term)){
                System.out.println("Result:");
                System.out.println(student);
            }
        }
    }
}