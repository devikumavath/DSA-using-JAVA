

public class subString {

    public static String printSubString(String greeting , int s , int e) {
           String substr = "";
        for (int i = s; i < e; i++) {

        substr+= greeting.charAt(i);
            
        }
        
        return substr;
    }

    public static void main(String[] args) {
        //substring --> subpart of string which is formed with continous part
        
        // pre-define function
        // .Substring(startindex , endindex)--> endindex is not included   
        String greeting = "hello world";
        System.out.println(greeting.substring(0 , 5));



        // user defined 
       String substr =  printSubString(greeting , 0 , 5);
       System.out.println(substr);




    }
    
}
