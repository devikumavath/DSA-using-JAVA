import java.util.Scanner;

public class productOfTwoNumbers {

    public static void product(int a, int b) {

        int sum = a + b;

        System.out.println("sum of " + a + " and " + b + " is " + sum);
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter a and b value");
        int a = obj.nextInt();
        int b = obj.nextInt();

        product(a, b);
        product(4, 1);

        obj.close();
    }

}
