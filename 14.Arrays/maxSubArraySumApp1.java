public class maxSubArraySumApp1 {

    public static void maxSumSubArray(int arr[]) {
        // brute froce approch
        // O(n3)

        int maxSum = Integer.MIN_VALUE;
        int sum;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {
                sum = 0;

                for (int k = i; k <= j; k++) {
                    // System.out.print(arr[k]);
                    sum += arr[k];

                }
                // System.out.println(sum);
                // System.out.println();

                if (maxSum < sum) {
                    maxSum = sum;
                }
            }

        }

        System.out.println(maxSum);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };

        maxSumSubArray(arr);
    }

}
