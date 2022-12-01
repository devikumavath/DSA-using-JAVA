import java.util.Scanner;

public class basics {
    public static void main(String[] args) {
        // varibles
       // datatype variableName = value;
       String name = "devi";
       // char test = 'd';
       // int age = 24;
       // int marks = 199;

       // single line comment

       /* multiline
        * 
        * comment
        * 
        */

        //how to print output on screen
        System.out.println(name);

        // how to take input from user 

        System.out.println("enter your mother name");
        Scanner obj = new Scanner(System.in);
        String name1 = obj.nextLine();

        System.out.println(name1);

       
obj.close();

   }
   
}




