import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        boolean isLeapYear = false;
        int year;

        Scanner inputYear = new Scanner(System.in);

        System.out.println("Input the year : ");

        year = inputYear.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }

        if (isLeapYear) {
            System.out.println(year + " is leap year");
        } else {
            System.out.println(year + " is not leap year");
        }


    }
}
