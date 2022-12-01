import java.util.Scanner;

public class feverCheck {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter temperture");
        double temp = obj.nextDouble();

        if (temp > 100) {
            System.out.println("you are suffering fever");
        } else {
           System.out.println("hurry! you are normal"); 
        }

        obj.close();
    }
    
}
