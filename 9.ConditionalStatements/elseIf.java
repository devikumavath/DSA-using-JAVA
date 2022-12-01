public class elseIf{
    public static void main(String[] args) {
        int age =13;

        if (age >= 18) {
            System.out.println("you are adult");
        }
        else if(age >= 13 && age < 18){
               System.out.println("you are teenager");
        }
        else {
            System.out.println("you are child");
        }


        
    }
}