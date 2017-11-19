import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random rand = new Random();
    private int num = 0;

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return numbers;
    }

    public void drawNumbers() {
        this.numbers = new ArrayList<Integer>();

        while (numbers.size() < 7) {
            num = 1 + (rand.nextInt(39));
            if (!(containsNumber(num))){
                numbers.add(num);
            }
        }
    }


    public boolean containsNumber(int number) {
        return numbers.contains(number);
    }
}
