import java.util.HashSet;

public class distinctElement {

    // approach 1

    // public static boolean findDuplicate(int[] nums) {

    // for (int i = 0; i < nums.length - 1; i++) {

    // for (int j = i + 1; j < nums.length; j++) {
    // if (nums[i] == nums[j]) {

    // return true;

    // }
    // }

    // }

    // return false;

    // }

    // apporach 2

    public static boolean findDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {

                return true;

            }
        }

        return false;

    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 7 };

        System.out.println(findDuplicate(nums));
    }
}