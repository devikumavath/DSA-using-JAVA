
import java.util.Arrays;
import java.util.Collections;

public class builtInMethod {

    public static void main(String[] args) {

        int arr[] = {3,5,4,1,2};
        Arrays.sort(arr);
        System.out.print(arr+" ");

        Arrays.sort(arr,1,4);

        Integer arr1[] = {3,5,4,1,2};
        Arrays.sort(arr1 , Collections.reverseOrder());

        
    }
    
}
