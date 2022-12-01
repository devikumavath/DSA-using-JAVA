import java.util.Scanner;

public class averageOf3 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("enter the value of a, b , c  ");
        int a = obj.nextInt();
        int b = obj.nextInt();
        int c = obj.nextInt();

        double avg = (a+b+c)/3;

        System.out.println("average of 3 numbers is " + avg);

        obj.close();

    }
    
}
