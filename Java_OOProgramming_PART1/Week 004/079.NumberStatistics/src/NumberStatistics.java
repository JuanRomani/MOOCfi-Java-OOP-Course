
public class NumberStatistics {

    private int amountOfNumbers;
    private int number

    public NumberStatistics(){
        amountOfNumbers = 0;
        number = 0;
    }

    public void addNumber(int number){
        amountOfNumbers++;
        number += number;
    }

    public int amountOfNumbers(){
        return amountOfNumbers;
    }

    public int sum(){
        return number;
    }

    public double average(){
        if (!(number == 0)) {
            return (double)number / amountOfNumbers();
        } else {
            return 0;
        }
    }
}
