public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices){
        int buy_smallest = Integer.MAX_VALUE;
        int buy_index = 0;
        for (int i = 0; i < prices.length; i++) {
            if(prices[i] < buy_smallest){
                buy_smallest = prices[i];
                buy_index = i;
            }
        }

        if(buy_index == prices.length-1){
            return 0;
        }
        else {

            int sell_largest = Integer.MIN_VALUE;
            for (int i = buy_index + 1; i < prices.length; i++) {
                if (prices[i] > sell_largest) {
                    sell_largest = prices[i];
                }
            }

            return sell_largest - buy_smallest;
        }
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
