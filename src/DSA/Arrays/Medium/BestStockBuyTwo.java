/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA.Arrays.Medium;

/**
 *
 * @author pt349
 */
public class BestStockBuyTwo {
public int maxProfit(int[] prices) {
    int profit = 0;

    for (int i = 1; i < prices.length; i++) {
        if (prices[i] > prices[i - 1]) {
            profit += prices[i] - prices[i - 1];
        }
    }

    return profit;
}
    public static void main(String[] args) {
    BestStockBuyTwo bestStockBuyTwo=new  BestStockBuyTwo();
        int arr[]={7,1,5,3,6,4};
        
    
    }
}
