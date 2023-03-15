public class insertAtAnyIndex {

    public static int[] insertAtSpecifiIndex(int[] arr, int element, int pos) {

        int newArr[] = new int[arr.length + 1];

        if (pos < 0 || pos > newArr.length) {
            System.out.println("invalid position ");
        } else {

            for (int i = 0; i < newArr.length; i++) {

                if (i < pos - 1)
                    newArr[i] = arr[i];

                else if (i == pos - 1)
                    newArr[i] = element;

                else
                    newArr[i] = arr[i - 1];

            }

        }
        return newArr;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5 };
        int element = 3;
        int pos = 3;

        System.out.println("original array : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println("\nnew array after adding element at position");

        int result[] = insertAtSpecifiIndex(arr, element, pos);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

}
