public class maxSubArraySumApp2 {

    public static void maxSubArraySum(int arr[]) {

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        // prefix array 
        int prefix[] = new int[arr.length];
        
        prefix[0] = arr[0];
  // calculate sum of the prefix 
        for(int i = 1 ; i < prefix.length ; i++)
        {
            prefix[i] = prefix[i-1]+arr[i];
        }

        for(int i = 0 ; i < arr.length ; i++){
            int start = i;
            for(int j =i ; j< arr.length ; j++){
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end]-prefix[start-1];
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }

        System.out.println("max sum :" + maxSum);
        



        
    }

    public static void main(String[] args) {
        //prefix sum approch

        int arr[] = {2,4,6,8 ,10};

        maxSubArraySum(arr);

    }
    
}
