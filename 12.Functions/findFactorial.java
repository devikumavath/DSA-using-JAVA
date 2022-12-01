import java.util.Scanner;

public class findFactorial {

    public static int factorial(int n) {
        int fact = 1;
        for (int i = n; i >= 1; i--) {
            fact *= i;
        }

        return fact;

    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter any number");
        int n = obj.nextInt();

        int ans = factorial(n);

        System.out.println("factorial of " + n + " is " + ans);

        obj.close();
    }

}
