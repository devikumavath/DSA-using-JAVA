public class maxSubArraySumApp3 {
    public static void kadanesAlgo(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0 ; i< arr.length ; i++){
            currSum = currSum+arr[i];
         
            if(currSum < 0)
            {
                currSum = 0;
            }
            else
            {
                maxSum = Math.max(currSum,maxSum);
                System.out.println(maxSum);
            }

           

            
        }
        System.out.println(maxSum);

}
    public static void main(String[] args) {
        int arr[] = {-2 ,-3 , 4 ,-1,-2,1,5,-3};

        kadanesAlgo(arr);
    }
}

