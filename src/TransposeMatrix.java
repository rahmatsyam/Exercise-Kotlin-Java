public class TransposeMatrix {

    public static void main(String[] args) {

        int[][] matrix = {{3, 2}, {1, 3}, {2, 4}};

        int[][] transpose = new int[2][3];

        //code transpose

        for (int i = 0; i < 2 ; i++) {

            for (int j = 0; j < 3 ; j++) {

                transpose[i][j] = matrix[j][i];
            }
        }

        System.out.println("Print without transpose");

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 2  ; j++){
                System.out.print(matrix[i] [j] + " ");
            }
            System.out.println();
        }
//
        System.out.println("Printing Matrix After Transpose");


        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(transpose[i][j] + "   ");
            }
            System.out.println();
        }

    }
}