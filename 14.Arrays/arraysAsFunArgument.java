public class arraysAsFunArgument {

    public static void addOne(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] += 1;
            System.out.println(numbers[i]);
        }
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 2, 4, 1, 3, 2 };

        addOne(numbers);
    }

}
