import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("-----calculator-----");

        System.out.println("enter number 1 ");
        int a = obj.nextInt();
        System.out.println("enter number 2 ");
        int b = obj.nextInt();

        System.out.println("enter operator ");
        char op = obj.next().charAt(0);

        int total;

        switch (op) {
            case '+':
                total = a + b;
                System.out.println("adding = " + total);
                break;

            case '-':
                total = a - b;
                System.out.println("subraction = " + total);
                break;

            case '*':
                total = a + b;
                System.out.println("multipication = " + total);
                break;

            case '/':
                total = a / b;
                System.out.println("division = " + total);
                break;

            case '%':
                total = a % b;
                System.out.println("modulo = " + total);
                break;

            default:
                System.out.println("invalid operator");
                break;
        }


        obj.close();

    }

}
