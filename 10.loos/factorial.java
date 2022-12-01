import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter any number");
        int n  = obj.nextInt();
         int i = n;
         int fact = 1;
        while (i >= 1 ) {
            fact*=i;
            i--;
        }

        System.out.println("factorial of " +  n + " is " + fact );

        obj.close();
    }
    
}
