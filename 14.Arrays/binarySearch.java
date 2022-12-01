public class binarySearch {

    public static int doBinarySearch(int num[], int key) {

        int start = 0;
        int end = num.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (num[mid] == key) {
                return mid;

            }

            else if (num[mid] < key) {

                start = mid + 1;

            }

            else {
                end = mid - 1;
            }

        }

        return -1;

    }

    public static void main(String[] args) {
        // array elements should be sorted
        int num[] = { 2, 4, 7, 9, 12, -15, 17, 20, 27, 78, 90 };
        int key = 15;

        System.out.println(key + " is at index " + doBinarySearch(num, key));
    }

}
