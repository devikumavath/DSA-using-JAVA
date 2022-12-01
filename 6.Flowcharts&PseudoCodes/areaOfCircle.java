import java.util.Scanner;

public class areaOfCircle {

    public static void main(String[] args) {
        
        // area = PI*r*r

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter radius of the circle ");
        int r = obj.nextInt();

        double  PI = 3.14;

        double area = PI*r*r;

        System.out.println("Area of circle is " + area);

        obj.close();
    }
    
}
