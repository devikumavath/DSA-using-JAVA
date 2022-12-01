public class typeCasting {

    public static void main(String[] args) {

        // big value to small value 
        // lossy conversion  --- explicit or narrowing 

        float a =  25.12f;
        System.out.println(a);

        //int b  = a;
        int c = (int)a;
        System.out.println(c);



        float marks1 = 25.999999f;
        
        int marks2 =  (int) marks1;

        System.out.println(marks1);
        System.out.println(marks2);



        // characters 
        char ch = 'a';
        int num = ch;
        System.out.println(num);

        
    }



    
    
}
