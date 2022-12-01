public class character {
    public static void main(String[] args) {
        int n = 5;
        int ch = 65;

        for (int i = 1; i <= n ; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print((char) ch);
                ch++;
            }

            System.out.println();
            
        }
    }
    
}
