import java.util.Scanner;

public class dayOfWeek {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter number of week(1-7)");
        int week = obj.nextInt();

        switch (week) {
            case 1:
                System.out.println("Monday");
                break;

                case 2:
                System.out.println("Tuesday");
                break;

                case 3:
                System.out.println("Wenesday");
                break;

                case 4:
                System.out.println("Thrusday");
                break;

                case 5:
                System.out.println("Friday");
                break;

                case 6:
                System.out.println("Saturday");
                break;

                case 7:
                System.out.println("Sunday");
                break;
        
            default:
               System.out.println("Invaild Week Number");
                break;
        }

obj.close();

    }
    
}
