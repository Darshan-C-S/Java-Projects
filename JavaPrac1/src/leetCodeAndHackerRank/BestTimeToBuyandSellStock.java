package leetCodeAndHackerRank;

import java.util.Arrays;

public class BestTimeToBuyandSellStock {
    public static int maxProfit(int[] prices) {

        int bye = Integer.MAX_VALUE , sell = 0;
        for (int i = 0; i < prices.length; i++) {
// get the min between the max integer value and prises in the list
            bye = Math.min(bye,prices[i] );
//            get the max between the sell prise 0 and the difference between the prises and bye
            sell = Math.max(sell , prices[i]-bye);

        }
        return sell;

    }


    public static void main(String[] args) {

        int [] a = {1,2,3,4,6,5};
        System.out.println(maxProfit(a));
        System.out.println(Integer.MAX_VALUE);

    }
}
