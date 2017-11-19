import java.util.ArrayList;

public class Variance {

    /*
        Create the method variance, which receives a list of integers as a parameter
         and then returns the sample variance of that list. You can use past exercises methods
     */
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

    public static int sum(ArrayList<Integer> list) {
        int i = 0;
        int sum = 0;

        while ((list.size() -1) >= i ) {
            sum += list.get(i);
            i++;
        }

        return sum;
    }

    public static double average(ArrayList<Integer> list) {
        double items = list.size();
        return sum(list) / items;
    }

    public static double variance(ArrayList<Integer> list) {
        // Variance formulae and explanation can be found on:
        // https://en.wikipedia.org/wiki/Variance#Population_variance_and_sample_variance

        double top = 0;
        double avg = average(list);

        for (double item : list) {
            item -= avg;
            item = Math.pow(item, 2);
            top += item;
        }

        return top / (list.size() -1);

    }

}
