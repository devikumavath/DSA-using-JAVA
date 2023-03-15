public class bubbleSortDe {

    public static void bubbleSort(int[] arr) {

        for(int i = 0 ; i < arr.length-1 ; i++){

            for (int j = 0; j < arr.length-1-i; j++) {
                // decreasing order condition
                if (arr[j]<arr[j+1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                    
                }
            }

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        
    }
    public static void main(String[] args) {
        int arr[] = {2 ,5,3,4,1};

        // System.out.println(arr.length);
        // System.out.println(arr.length-1);
        // for(int i = 0 ; i < arr.length ; i++){
        //     System.out.print(i + " ");
        // }

        bubbleSort(arr);
    }
}