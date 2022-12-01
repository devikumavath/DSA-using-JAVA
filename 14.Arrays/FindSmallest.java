public class FindSmallest {

    public static int getSmallest(int num[]) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (smallest > num[i]) {
                smallest = num[i];
            }
        }

        return smallest;
    }

    public static void main(String[] args) {
        int num[] = { -1, 3, 0, 6, 8, 19 };

        System.out.println("smallest value :" + getSmallest(num));
    }

}
