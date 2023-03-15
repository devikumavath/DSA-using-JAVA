import java.util.*;

public class tripletSumZero {

    // approach 1 -- > three loops (can find triplet with sum = 0 but will have
    // duplicate output) --> O(n3)
    // triplet sum == 0

    public static void zeroSum(int nums[]) {

    for (int i = 0; i < nums.length; i++) {

    for (int j = i + 1; j < nums.length; j++) {

    for (int k = i + 2; k < nums.length; k++) {

    if ((nums[i] + nums[j] + nums[k]) == 0 && nums[i] != nums[j] && nums[i] !=
    nums[j]
    && nums[j] != nums[k]) {

    System.out.println("( " + nums[i] + "," + nums[j] + "," + nums[k] + " )");

    }

    }

    }

    }

    }

    // approach 2 -- sets
    public static List<List<Integer>> threeSum(int nums[]) {

        List<List<Integer>> result = new ArrayList<List<Integer>>();

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                for (int k = i + 2; k < nums.length; k++) {

                    if ((nums[i] + nums[j] + nums[k]) == 0) {

                        List<Integer> triplets = new ArrayList<Integer>();

                        triplets.add(nums[i]);
                        triplets.add(nums[j]);
                        triplets.add(nums[k]);

                        Collections.sort(triplets);

                        result.add(triplets);

                    }

                }

            }

        }

        result = new ArrayList<List<Integer>>(new LinkedHashSet<List<Integer>>(result));

        return result;

    }

    public static void main(String[] args) {

        int nums[] = { -1, 0, 1, 2, -1, -4 };

         zeroSum(nums);

        System.out.println(threeSum(nums));

    }

}
