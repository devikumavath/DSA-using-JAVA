public class breakANDcontinue {

    public static void main(String[] args) {

        // break : to exit the loop
        for (int i = 0; i < 5; i++) {
            if (i ==3) {
                break;
            }
            System.out.println(i);
        }

        //continue : to skip the iteration
        for (int i = 1; i <= 5; i++) {
            if (i==3) {
                continue;
            }

            System.out.println(i);
            
        }


        
    }
    
}
