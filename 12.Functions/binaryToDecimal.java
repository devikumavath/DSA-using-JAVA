public class binaryToDecimal {
    public static void binToDec(int binNum) {
        int myNum = binNum;
        int pow = 0;
        int decnum = 0;
        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decnum = decnum + (lastDigit * (int) Math.pow(2, pow));
            pow++;

            binNum /= 10;

        }
        System.out.println("decimal of " + myNum + " = " + decnum);
    }

    public static void main(String[] args) {

        binToDec(101);

    }

}
