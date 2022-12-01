import java.util.Scanner;

public class enterAllEXpect10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        do {
            System.out.println("enter any number");
            int n = scn.nextInt();
            if (n % 10 == 0) {
                continue;
            }

            System.out.println("number is " + n);

        } while (true);

    }

}
