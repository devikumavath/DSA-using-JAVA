public class typeConversion {

    public static void main(String[] args) {
        /*
         * conversion happens when:  (wideing or implicit)
         * a.type compatible
         * b.destination type > source type 
         * 
         * byte > short > int > float > long > double 
         */


         int a = 25;
         float b = a;
        // short c = a;   
        // lossy conversion 

        System.out.println(a);
        System.out.println(b);


    }
    
}
