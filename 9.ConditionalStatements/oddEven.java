import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int n = obj.nextInt();

        if (n%2==0) {
            System.out.println("even number");
        } else {
           System.out.println("odd number"); 
        }

        obj.close();
    }
    
}
