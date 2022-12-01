public class reverseArray {

    public static void reverse(int arr[]) {
        int frist = 0;
        int last = arr.length-1;
        while (frist < last) {
            int temp = arr[last];
            arr[last] = arr[frist];
            arr[frist] = temp;
            frist++;
            last--;
            
        }
        
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};

        // System.out.println(arr.length);
        // System.out.println(arr.length-1);

        reverse(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        
    }
    
}
