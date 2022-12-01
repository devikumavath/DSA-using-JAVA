import java.util.Scanner;

public class primeNumber {

    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        System.out.println("enter any number ");
        int n = obj.nextInt();

        for(int i = 2 ; i < n;)
        {
           if(n%2==0)
           {
            System.out.println(n + " is not a PRIME number");
            break;

           } 
           else
           {
            System.out.println(n + " is a PRIME number ");
            break;
        }
    }
    
    obj.close();
}


}
