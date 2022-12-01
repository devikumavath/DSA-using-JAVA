import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter year");
        int year = obj.nextInt();


        if (year%4==0 && year%100==0 && year%400==0) {
            System.out.println(year + " is a leap year");
        } else {
           System.out.println(year + " is not a leap year"); 
        }

        obj.close();
    }
    
}
