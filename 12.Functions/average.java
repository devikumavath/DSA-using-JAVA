import java.util.Scanner;

public class average {

    public static void avgOfThree(int a , int b , int c)
    {
        int avg = (a+b+c)/3;

        System.out.println("average of three numbers is " + avg);
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter three numbers");
        int a = obj.nextInt();
        int b = obj.nextInt();
        int c = obj.nextInt();

        avgOfThree(a,b,c);

        obj.close();
    }
    
}
