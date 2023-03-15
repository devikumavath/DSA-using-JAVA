public class smallestAndLargestEle {

    public static void findSmallLarge(int matrix[][]) {

        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int i, j;

        for (i = 0; i < matrix.length; i++) {
            for (j = 0; j < matrix[0].length; j++) {
                // smallest = Math.min(smallest, matrix[i][j]);
                // largest = Math.max(largest, matrix[i][j]);

                if (smallest > matrix[i][j]) {
                    smallest = matrix[i][j];
                }

                if (largest < matrix[i][j]) {
                    largest = matrix[i][j];
                }
            }
        }

        // System.out.println("smallest value at index " + "(" + i + " , " + j + ")");
        // System.out.println("largest value at index " + "(" + i + " , " + j + ")");

        System.out.println(smallest + " " + largest);

    }

    public static void main(String[] args) {
        int matrix[][] = { { 3, 5, 12 }, { 23, 6, 7 }, { 0, 4, 2 } };

        findSmallLarge(matrix);
    }

}
