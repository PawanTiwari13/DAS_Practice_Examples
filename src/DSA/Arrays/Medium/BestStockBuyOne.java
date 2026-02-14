package DSA.Arrays.Medium;

public class BestStockBuyOne {

    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;   // better buying price found
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice);

            }

        }
        System.out.println(" " + maxProfit);
        return maxProfit;

    }

    public static void main(String[] args) {
        BestStockBuyOne bsb = new BestStockBuyOne();
        int arr[] = {7, 1, 5, 3, 6, 4};
        bsb.maxProfit(arr);

    }

}
