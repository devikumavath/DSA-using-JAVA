public class prime {

    
    public static boolean checkprime(int n) {

        if (n == 2) {
            return true;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }

        }

        return true;

    }

    public static void main(String[] args) {

        System.out.println("9 prime ?" + checkprime(9));

        System.out.println("2 prime ?" + checkprime(2));

        System.out.println("5 prime ?" + checkprime(5));

    }

}
