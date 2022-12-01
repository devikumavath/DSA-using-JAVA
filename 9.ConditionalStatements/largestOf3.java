import java.util.Scanner;

public class largestOf3 {
    public static void main(String[] args) {
        
       Scanner obj = new Scanner(System.in);
       int a = obj.nextInt();
       int b = obj.nextInt();
       int c = obj.nextInt();

       if (a  >= b && a >= c) {
          System.out.println(a + " largest number");
       }
       else if(b >= c)
       {
          System.out.println(b + " largest number ");
       }
       else
       {
        System.out.println(c + " largest number");
       }


       obj.close();
    }
    
}
