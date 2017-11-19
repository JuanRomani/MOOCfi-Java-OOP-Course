import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // write testcode here

        int[] values = {-1, 6, 9, 8, 12};
        System.out.println("smallest: " + smallest(values));
        System.out.println();

        System.out.println("Index of the smallest: " + indexOfTheSmallest(values));
        System.out.println();

        System.out.println(indexOfTheSmallestStartingFrom(values, 1));
        System.out.println(indexOfTheSmallestStartingFrom(values, 2));
        System.out.println(indexOfTheSmallestStartingFrom(values, 4));
        System.out.println();


        int[] values1 = {3, 2, 5, 4, 8};

        System.out.println( Arrays.toString(values1) );

        swap(values1, 1, 0);
        System.out.println( Arrays.toString(values1) );

        swap(values1, 0, 3);
        System.out.println( Arrays.toString(values1) );
        System.out.println();

        int[] values2 = {8, 3, 7, 9, 1, 2, 4};
        sort(values2);
    }

    public static int smallest(int[] array){
        int smallest = 0;
        int temp = array[0];

        for(int i = 0; i < array.length; i++){
            if(array[i] < temp){
                smallest = array[i];
                temp = smallest;
            }
        }

        return smallest;
    }

    public static int indexOfTheSmallest(int[] array){
        int smallest = 0;
        int temp = array[0];
        int ind = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] < temp){
                smallest = array[i];
                temp = smallest;
                ind = i;
            }
        }

        return ind;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index){
        int smallest = 0;
        int temp = array[index];
        int ind = 0;

        for(int i = index; i < array.length; i++){
            if(array[i] <= temp){
                smallest = array[i];
                temp = smallest;
                ind = i;
            }
        }

        return ind;
    }

    public static void swap(int[] array, int index1, int index2){
        int temp1 = array[index1];
        int temp2 = array[index2];

        array[index1] = temp2;
        array[index2] = temp1;
    }

    public static void sort(int[] array){
        System.out.println(Arrays.toString(array));

        for(int i = 0; i < array.length; i++){
            swap(array, i, indexOfTheSmallestStartingFrom(array, i));
            System.out.println(Arrays.toString(array));
        }

    }

}
