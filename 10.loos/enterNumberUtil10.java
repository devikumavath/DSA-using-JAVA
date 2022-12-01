import java.util.Scanner;

public class enterNumberUtil10 {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        do {
            System.out.print("enter any number : ");
            int n = obj.nextInt();
            if (n % 10 == 0) {
                System.out.println("game over");
                break;

            }

            System.out.println(n);

        } while (true);

        obj.close();
    }

}
