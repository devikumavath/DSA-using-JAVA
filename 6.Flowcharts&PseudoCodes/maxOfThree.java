import java.util.Scanner;



public class maxOfThree {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("enter the value of a , b , c");
        int a = obj.nextInt();
        int b= obj.nextInt();
        int c  = obj.nextInt();

        if(a>b && a>c)
        {
            System.out.println(a + " greatest number");
        }

        else if(b>c)
        {
            System.out.println(b + " greatest number " ); 
        }

        else 
        {
            System.out.println(c + " greatest number " );
        }

        obj.close();

    }
    
}
