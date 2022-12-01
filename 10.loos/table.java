import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter number");
        int n = obj.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n+" * "+i+" = " + (n*i));
        }


        obj.close();
    }
    
}
