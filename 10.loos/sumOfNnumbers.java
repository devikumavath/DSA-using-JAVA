import java.util.Scanner;

public class sumOfNnumbers {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
          System.out.println("enter any number");
        int n = obj.nextInt();

        int sum=0;
        for (int i = 1; i <= n ; i++) {
          sum+=i;
        }
        System.out.println("sum of 1 to " + n + " numbers is " + sum);  

        obj.close();
    }
    
}