public class insertionDe {

    public static void insertionSort(int arr[]) {

        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;
            // finding correct pos to insert
            while (prev >= 0 && arr[prev] < curr) {
                arr[prev + 1] = arr[prev];
                prev--;

            }
            // insertion
            arr[prev + 1] = curr;

        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]+ " ");
        }

        
    }

    
    public static void main(String[] args) {
        int arr[] = {2 , 4, 1 , 3 , 8};

        insertionSort(arr);
        
    }
    
}
