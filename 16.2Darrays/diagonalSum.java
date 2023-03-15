public class diagonalSum {

    // mwthod 1 -- O(n2)
    // public static int diaSum(int matrix[][]) {

    // int sum = 0;
    // for (int i = 0; i < matrix.length; i++) {
    // for (int j = 0; j < matrix.length; j++) {
    // if (i == j) {
    // sum += matrix[i][j];
    // } else if (i + j == matrix.length - 1) {
    // sum += matrix[i][j];
    // }
    // }
    // }

    // return sum;
    // }

    // method 2 -- O(n)

    public static int diaSum2(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {

            sum += matrix[i][i];

            if (i != matrix.length - i - 1) {

                sum += matrix[i][matrix.length - i - 1];

            }

        }
        return sum;

    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        // System.out.println(diaSum(matrix));

        System.out.println(diaSum2(matrix));
    }

}