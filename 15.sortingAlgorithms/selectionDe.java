public class selectionDe {

    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length-1; i++) {

            int minPos = i;

            for (int j = i+1; j < arr.length; j++) {
              if (arr[minPos] > arr[j]) {
                minPos = j;
                
              }
              // swap
              int temp = arr[minPos];
              arr[minPos] = arr[j];
              arr[j] = temp;            
            }

        }

        // output
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        
    }
    public static void main(String[] args) {
        int arr[] = {4 , 5, 1 , 2, 3};

        selectionSort(arr);
    }
    
}
