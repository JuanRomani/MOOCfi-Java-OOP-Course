import java.util.ArrayList;
import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private String password = "";
    private String temp = "";
    private int length;
    private Random random;
    private String abc = "abcdefghijklmnopqrstuvwxyz";
    private int i = 0;

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
        random = new Random();
    }

    public String createPassword() {
        // Write code that returns a randomized password
        while (i < length){
            temp += abc.charAt(random.nextInt(26));
            i++;
        }

        this.password = this.temp;
        this.temp = "";
        this.i = 0;
        return password;
    }
}
