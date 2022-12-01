import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter any number");
        int n = obj.nextInt();

        Boolean test = true;

        if (n == 2) {
            System.out.println(n + " is prime");
        }

        else {

            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    test = false;
                }
            }

            if (test) {
                System.out.println(n + " is prime");
            } else {
                System.out.println(n + " is not prime");
            }

        }
        obj.close();
    }

}
