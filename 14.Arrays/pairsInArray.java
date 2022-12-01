public class pairsInArray {

    public static void getpairs(int arr[]) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            // int curr = arr[i];
            for (int j = i+1; j < arr.length; j++) {
                System.out.print("("+ arr[i]  + " , " + arr[j] + ") ");
                total++;
            }

        System.out.println();
        }

        System.out.println("total " + total);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};

        getpairs(arr);

    }
    
}
