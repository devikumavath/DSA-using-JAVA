public class linearSearch {
    public static void main(String[] args) {
        int num[] = { 2, 3, 4, 6, 12, 7, 8, 9, 0 };
        int key = 12;

        for (int i = 0; i < num.length; i++) {
            if (num[i] == key) {
                System.out.println("key element " + key + " is at " + (i + 1));
            }
        }
    }

}
