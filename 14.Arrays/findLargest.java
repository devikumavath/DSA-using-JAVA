public class findLargest {

    public static int getLargest(int num[]) {

        int largest = Integer.MIN_VALUE;
        

        for (int i = 0; i < num.length; i++) {
            if (largest < num[i]) {
               largest = num[i]; 
            }
        }

        return largest;
        
    }
    public static void main(String[] args) {
        int num[] = { 12 , 13 , 5 , 18 , 3 , 5 };

        System.out.println("largest value :" + getLargest(num));

        // int ls = Integer.MIN_VALUE;
        // System.out.println(ls);
    }
    
}
