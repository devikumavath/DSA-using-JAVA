public class countingSort {

    public static void countSortIn(int arr[]) {

        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
         int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
         }
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        // counting sort is used when range of numbers is less
        // like marks of student range btw 1-100(range)

        // 1 ,4,1,3,2,4,3,7 ----> range min=1 , max=7
        // frequency of number is sorted in temp array count[]
        // O(n+range)
        int arr[] = { 1, 4, 1, 3, 2, 4, 3, 7 };
        countSortIn(arr);
        printArr(arr);
    }
}












