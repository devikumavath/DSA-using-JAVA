import java.util.Scanner;

public class simpleInterest {

    public static void main(String[] args) {
        //SI = PTR/100
        Scanner obj = new Scanner(System.in);

        System.out.println("enter principal amount ");
        int p = obj.nextInt();

        System.out.println("enter the time periods");
        int t = obj.nextInt();

        System.out.println("enter the rate of interest ");
        int r = obj.nextInt();

        double SI = (p*t*r)/100;

        double total = p+SI;

        System.out.println("simple interest is " + total);

    obj.close();
    }
    
}
