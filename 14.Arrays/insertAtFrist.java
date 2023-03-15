
public class insertAtFrist {

    public static void insertAtFristInAnArray(int arr[], int element) {

        int temp[] = new int[arr.length + 1];
        temp[0] = element;
        for (int i = 0; i < arr.length; i++) {
            temp[i + 1] = arr[i];
        }

        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " ");
        }

    }

    public static void main(String[] args) {

        int arr[] = { 2, 3, 5, 7, 23 };

        int element = 1;

        System.out.println("original array element");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // for (int i : arr) {
        // System.out.print(i+" ");
        // }

        System.out.println("\nnew array after insertion ");

        insertAtFristInAnArray(arr, element);

    }

}
