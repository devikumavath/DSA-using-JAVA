public class search2Darr {

    public static boolean searchElement(int matrix[][], int key) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {

                    System.out.println("found at index " + "(" + i + " , " + j + ")");

                    return true;

                }
            }
        }

        return false;

    }

    public static void main(String[] args) {

        int matrix[][] = { { 1, 4, 5 }, { 14, 7, 0 }, { 2, 3, 6 } };
        int key = 14;

        searchElement(matrix, key);

    }

}
