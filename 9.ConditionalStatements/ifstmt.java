import java.util.Scanner;

public class ifstmt {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);


         System.out.println("enter your age ");
        int age = obj.nextInt();

        if(age>=18)
        {
        System.out.println("you are adult");
        }

        obj.close();
    }
    
}
