package manipulation;

import java.util.TreeSet;

public class ElementTreeSet {

    public static void main(String[] args){

        TreeSet<Integer> oddNumbers = new TreeSet<>();

        //use add()
        oddNumbers.add(3);
        oddNumbers.add(5);
        oddNumbers.add(7);
        System.out.println("TreeSet: " + oddNumbers);

        TreeSet<Integer>numbers = new TreeSet<>();
        numbers.add(2);

        //use addAll()
        numbers.addAll(oddNumbers);
        System.out.println("New TreeSet: " + numbers);





    }
}
