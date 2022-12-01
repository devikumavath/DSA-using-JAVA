import java.util.Scanner;

public class arrayBasics {
    public static void main(String[] args) {
        // array creation
        // int marks[] = { 90 , 89,67};
        // System.out.println(marks[0]);

        // String fruits[] = {"apple" , "mango" , "banana"};
        // System.out.println(fruits[1]);

        // int oddNumbers[];  //declare
        // oddNumbers = new int[5]; //define


        int marks[] =  {1 , 2, 3, 4, 5};
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        System.out.println(marks.length);


        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }


        // input from user
        Scanner obj = new Scanner(System.in);
        System.out.println("enter marks");
        int mark[] = new int[5];


        // input
        for (int i = 0; i < marks.length; i++) {
          mark[i] =  obj.nextInt();
        }

        //output
        for (int i = 0; i < mark.length; i++) {
            System.out.println(mark[i]);
        }

        

    
        

obj.close();
       
        
    }
    
}
