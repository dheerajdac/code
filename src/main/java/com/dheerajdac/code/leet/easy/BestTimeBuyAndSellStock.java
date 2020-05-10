package com.dheerajdac.code.leet.easy;

public class BestTimeBuyAndSellStock {

    public int maxProfit(int[] prices) {
        int maxSoFar = 0;
        int maxTillNow = 0;

        int i=0,j=0;

        while (i<prices.length && j < prices.length){
            if(prices[i] <= prices[j]){
                maxTillNow = prices[j] - prices[i];
            } else{
                i=j;
            }
            j++;

            if(maxSoFar < maxTillNow){
                maxSoFar = maxTillNow;
            }
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        BestTimeBuyAndSellStock buyAndSellStock = new BestTimeBuyAndSellStock();
        int[] arr = {7,1,5,3,6,4};
        System.out.println(buyAndSellStock.maxProfit(arr));
        int[] arrs = {7,6,4,3,1};
        System.out.println(buyAndSellStock.maxProfit(arrs));
    }
}
