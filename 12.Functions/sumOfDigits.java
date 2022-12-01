public class sumOfDigits {

    public static int checkDigitsSum(int n) {

        int sum = 0;
        while (n != 0) {
            int rem = n % 10;
            sum += rem;
            n /= 10;

        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(checkDigitsSum(1221));
    }
}
