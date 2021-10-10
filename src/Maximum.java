import java.util.Scanner;

//phikuroro 

public class Maximum {

    public static void main(String[] args) {

        double x, y, z, maximum;

        Scanner scan = new Scanner(System.in);

        System.out.print("Value X : ");
        x = scan.nextDouble();

        System.out.print("Value Y : ");
        y = scan.nextDouble();

        System.out.print("Value Z : ");
        z = scan.nextDouble();

        maximum = x; // assumpstion x is maximum

        if (maximum < y) {
            maximum = y;
        }

        if (maximum < z) {
            maximum = z;
        }

        System.out.println("Maximun is " + maximum);

    }
}
