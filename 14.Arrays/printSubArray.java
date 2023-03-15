public class printSubArray {

    public static void subArray(int arr[]) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] );
                    sum += arr[k];
                }
                System.out.println("\nsum " + sum);

               
            }

        }

    }

    public static void main(String[] args) {
        // continous part of an array
        // total sub array = n*(n+1)/2

        int arr[] = { 2, 4, 6, 8, 10 };

        subArray(arr);
    }

}
