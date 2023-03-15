import java.util.Scanner;

public class creating2Darr {

    public static void main(String[] args) {

        // int matrix1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        // for (int i = 0; i < matrix1.length; i++) {

        // for (int j = 0; j < matrix1.length; j++) {
        // System.out.print(matrix1[i][j]+" ");
        // }
        // System.out.println();
        // }

        Scanner obj = new Scanner(System.in);

        System.out.println("enter row size");
        int row = obj.nextInt();

        System.out.println("enter col size");
        int col = obj.nextInt();

        int matrix[][] = new int[row][col];
        // 3X3 = 9 cells

        System.out.println("enter matrix element " + "(max) " + (row * col));
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = obj.nextInt();
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {

                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }

        obj.close();
    }

}
