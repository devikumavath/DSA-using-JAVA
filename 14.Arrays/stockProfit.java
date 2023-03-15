public class stockProfit {

    public static int makeProfit(int prices[]) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int i, start = 0;
        for (i = 0; i < prices.length; i++) {
            if (prices[i] < min) {

                min = prices[i];
                start = i;

            }

        }

        System.out.println("min " + min);

        // System.out.println("start " + start);

        for (int j = start; j < prices.length; j++) {

            // if (start == prices.length) {
            // return 0;

            // }

            if (prices[j] > max && start < prices.length) {

                max = prices[j];
            }

        }

        System.out.println("max " + max);

        int profit = max - min;

        System.out.println("profit " + profit);

        if (profit > 0) {
            return profit;

        } else {
            return 0;
        }

    }

    public static void main(String[] args) {
        // int prices[] = { 7, 1, 5, 3, 6, 4 };

        int prices[] = { 7, 6, 4, 3, 1, 2 };

        System.out.println(makeProfit(prices));

    }

}
