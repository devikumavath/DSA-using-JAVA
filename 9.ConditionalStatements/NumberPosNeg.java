import java.util.Scanner;

public class NumberPosNeg {
    
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter any number");
        int num = obj.nextInt();

        if (num >= 0) {
            System.out.println(num + " is a postive number");
        } else {
            System.out.println(num + " is a negative number"); 
        }

        obj.close();
    }
}
