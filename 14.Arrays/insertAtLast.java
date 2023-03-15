public class insertAtLast {


    public static int[] insertAtLastInAnArray(int[] arr , int element){

        int newArr[] = new int[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
          newArr[i] = arr[i];  
        }
        newArr[arr.length] = element;


        return newArr;

    }
    public static void main(String[] args) {
        
        int arr[] = { 2 , 4 , 8 , 10};
        int element = 12;

        System.out.println("original array : ");
        for (int i : arr) {
            System.out.print(i+" ");
        }


        System.out.println("\nnew array after adding element at last index");
        int result[] = insertAtLastInAnArray(arr, element);
        for (int i : result) {
            System.out.print(i+" ");
        }

       
    }
    
}
