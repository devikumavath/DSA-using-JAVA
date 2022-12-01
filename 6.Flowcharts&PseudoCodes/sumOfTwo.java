import java.util.Scanner;

public class sumOfTwo {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("enter value of a");
        int a = obj.nextInt();

        System.out.println("enter value of b");
        int b = obj.nextInt();

        int sum = (a+b);

        System.out.println("sum of " + a + " and " + b + " is " + sum );

        obj.close();
    }
}