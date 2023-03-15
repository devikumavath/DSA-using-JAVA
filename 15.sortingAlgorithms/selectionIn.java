public class selectionIn {
    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    // swap
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }

    }

    public static void main(String[] args) {
        int arr[] = { 4, 3, 1, 2, 5 };

        selectionSort(arr);
    }

}



