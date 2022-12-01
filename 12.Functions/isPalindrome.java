public class isPalindrome {

    public static boolean checkPalindrome(int n) {
        int mynum = n;
        int reverse = 0;
        while (n != 0) {
            int rem = n % 10;
            reverse = reverse * 10 + rem;
            n /= 10;
        }

        if (mynum == reverse) {
          return true ; 
        }
        else{
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println(checkPalindrome(121));
    }

}
