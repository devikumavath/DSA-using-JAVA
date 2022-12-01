import java.util.Scanner;

public class areaOfSquares {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("enter the length of side");
        int size = obj.nextInt();

        int area = (size*size);

        System.out.println("area of square is " + area);

        obj.close();
    }
    
}
