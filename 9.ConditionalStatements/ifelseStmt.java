import java.util.Scanner;

public class ifelseStmt {

    public static void main(String[] args) {
        
    

    // grestest of two numbers
    Scanner obj = new Scanner(System.in);


    System.out.println("enter value of a");
    int a = obj.nextInt();
    
    System.out.println("enter value of b");
    int b = obj.nextInt();

    if (a>b) {
         System.out.println("a is greater than b"); 
    } else {
        System.out.println("b is greater than a"); 
    }

    obj.close();
    }
    
}
