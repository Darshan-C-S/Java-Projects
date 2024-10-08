package leetCodeAndHackerRank;

public class MaxProfit {
    public static int maxProfit(int[] prices) {

            int buy = prices[0];
            int profit = 0;
            for (int i = 1; i < prices.length; i++) {
                if (prices[i] < buy) {
                    buy = prices[i];
                } else if (prices[i] - buy > profit) {
                    profit = prices[i] - buy;
                }
            }
            return profit;
        }

    public static void main(String[] args) {

        int [] profits = {7,1,5,3,6,4};
        int pr = maxProfit(profits);
        System.out.println(pr);






    }
}
