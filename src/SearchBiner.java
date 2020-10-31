public class SearchBiner {

    public static void main(String[] args) {
        int[] data = {1, 2, 4, 4, 5, 7, 8, 10, 13, 14, 15};
        int searchBiner = 8;

        System.out.println("Position search biner on array : " + search(data, data.length, searchBiner));


    }

    public static int search(int[] data, int n, int k) {
        int top, bottom, middle, position;

        boolean exist;

        position = -1;
        exist = false;
        bottom = 0;
        top = n - 1;

        while (top >= bottom) {

            middle = (top + bottom) / 2;
            if (k < data[middle]) {
                bottom = middle + 1;
            } else {
                exist = true; //find biner
                position = middle;
                bottom = top + 1; // end looping
            }
        }

        if (!exist) position = -1;

        return position;
    }
}
