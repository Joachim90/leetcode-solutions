public class leet1475FinalPriceSpecialDiscount {

    // prices = [8,4,6,2,3]
    class Solution {
        public int[] finalPrices(int[] prices) {
            for (int i = 0 ; i < prices.length - 1 ; i++) {
                for (int j = i + 1 ; j < prices.length ; j++) {
                    if (prices[i] >= prices[j]) {
                        prices[i] = prices[i] - prices[j];
                        break;
                    }
                }

            }
            return prices;
        }
    }
}
