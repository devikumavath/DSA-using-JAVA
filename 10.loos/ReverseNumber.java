import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        //   int num = 123;
        //   while (num > 0) {
        //      int rem = num%10;
        //      System.out.print(rem);
        //      num = num/10; 
        //   }

        Scanner obj = new Scanner(System.in);
        System.out.println("enter number");
        int num = obj.nextInt();

        while (num!=0) {
          int rem = num%10;
          System.out.print(rem);
          num/=10;
            
        }
   
obj.close();
    }

    

    
}
