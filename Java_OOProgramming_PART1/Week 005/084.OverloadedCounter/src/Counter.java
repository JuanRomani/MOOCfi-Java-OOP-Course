public class Counter {

    private int number;
    private boolean check;

    public Counter (int startingValue, boolean check){
        number = startingValue;
        this.check = check;
    }

    public Counter (int startingValue){
        number = startingValue;
    }

    public Counter (boolean check){
        this.check = check;
    }

    public Counter(){
    }

    public int value(){
        return number;
    }

    public void increase(){
        number++;
    }

    public void decrease(){
        if (check && number < 1){
            number = 0;
        } else {
            number--;
        }
    }

    public void increase (int increaseAmount){
        if (increaseAmount >= 0){
            number += increaseAmount;
        }
    }

    public void decrease (int decreaseAmount){
        if (check && number < decreaseAmount && decreaseAmount > 0){
            number = 0;
        } else if (!(check) && decreaseAmount > 0){
            number -= decreaseAmount;
        }
    }
}
