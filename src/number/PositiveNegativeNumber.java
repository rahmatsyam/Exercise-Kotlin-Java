package number;

import java.util.Scanner;

public class PositiveNegativeNumber {

    public static void main(String[] args) {

        String output;

        Scanner input = new Scanner(System.in);

        System.out.println("Input positive or negative number : ");

        int number = input.nextInt();

        if (number >= 0) {
            output = number + " : Positive Number";
        } else {
            output = number + " : Negative Number";
        }

        System.out.println(output);
    }
}
