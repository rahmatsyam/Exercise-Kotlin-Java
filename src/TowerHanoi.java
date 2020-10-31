import java.util.Scanner;

public class TowerHanoi {

    public static void main(String[] args) {
        int totalPlate;

        Scanner scan = new Scanner(System.in);
        System.out.print("Total plate = ");
        totalPlate = scan.nextInt();

        hanoi(totalPlate, 'A', 'B', 'C');
    }

    public static void hanoi(int n, char a, char b, char c) {
        if (n == 1) {
            System.out.println("Move plate from " + a + " to " + c);
        } else {
            hanoi(n - 1, a, c, b);
            hanoi(1, a, b, c);
            hanoi(n - 1, b, a, c);
        }
    }
}
