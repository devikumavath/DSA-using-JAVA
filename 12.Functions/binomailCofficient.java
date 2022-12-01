import java.util.Scanner;
/* formula
 * Ncr = n!/r!(n-r)!
 */

public class binomailCofficient {

    public static int factorial(int n) {
        int fact = 1;
        for (int i = n; i >= 1; i--) {
            fact *= i;
        }

        return fact;

    }

    public static int bincoeff(int n, int r) {
        int nfact = factorial(n);
        // System.out.println(nfact);
        int rfact = factorial(r);
        // System.out.println(rfact);

        int nmrfact = factorial(n - r);
        // System.out.println(nmrfact);
        int bc = nfact / (rfact*nmrfact);

        return bc;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the value of n and r");
        int n = obj.nextInt();
        int r = obj.nextInt();

        int ans = bincoeff(n, r);
        System.out.println("binomail coefficient is " + ans);

        obj.close();

    }

}
