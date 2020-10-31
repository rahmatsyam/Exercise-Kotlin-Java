public class MaxRekur {

    public static void main(String[] args) {
        int[] L = {1, 4, 6, 2, 8, 5, 2, 4, 3};

        System.out.println(max(L, 9, 2));
        System.out.println(max(L, 9, 4));
        System.out.println(max(L, 9, 9));

    }

    public static int max(int[] data, int n, int k) {
        if (k > n) {
            k = n;
        }

        if (k == 1) {
            return data[0];
        } else {
            if (k > 1) {
                return Math.max(data[k - 1], max(data, n, k - 1));
            } else {
                return -32768;
            }
        }


    }
}
