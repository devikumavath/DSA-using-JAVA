import java.util.Scanner;

public class oddEvenSum {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter number");
        int n = obj.nextInt();

        int sum1 = 0, sum2 = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum1 += i;
            } else {
                sum2 += i;
            }
        }

        System.out.println("sum of even number between 1 to " + n + " is " + sum1);

        System.out.println("sum of odd number between 1 to " + n + " is " + sum2);

        System.out.println("total sum = " + (sum1 + sum2));

        obj.close();
    }

}
