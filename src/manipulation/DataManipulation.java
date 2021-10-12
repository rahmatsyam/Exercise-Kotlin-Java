package manipulation;

import java.util.ArrayList;
import java.util.Collections;

public class DataManipulation {

    public static void main(String[]args){

        //create arraylist
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(0);
        numbers.add(2);
        numbers.add(4);
        System.out.println("Arraylist: " + numbers);

        //user reverse
        Collections.reverse(numbers);
        System.out.println("Arraylist Reverse: " + numbers);

        //use swap
        Collections.swap(numbers, 0,1);
        System.out.println("Arraylist Swap: " + numbers);

        ArrayList<Integer> newNumbers = new ArrayList<>();

        //use addAll
        newNumbers.addAll(numbers);
        System.out.println("Arraylist use addAll : " + newNumbers);

        //use fill
        Collections.fill(numbers, 0);
        System.out.println("Arraylist use fill : " + newNumbers);

        //use copy
        Collections.copy(newNumbers, numbers);
        System.out.println("Arraylist use copy : " + newNumbers);





    }
}
