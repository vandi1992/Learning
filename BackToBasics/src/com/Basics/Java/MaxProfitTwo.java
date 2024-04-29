package com.Basics.Java;

public class MaxProfitTwo {
    public static int maxProfit(int[] prices) {
        int buyValue = prices[0];
        int profit = Integer.MIN_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (buyValue - prices[i + 1] > 0) {
                buyValue = prices[i + 1];
            } else if (buyValue - prices[i + 1] < 0) {
                if(profit < (prices[i + 1] - buyValue)) {
                    maxProfit = maxProfit+ prices[i + 1] - buyValue;
                    buyValue = 0;
                }
            }
        }
        return (maxProfit>0?maxProfit:0);
    }

    public static void main(String[] args){
        int[] a = {7,1,5,3,6,4};
       // int[] a = {7,6,4,3,1};
        System.out.println(maxProfit(a));
    }
}
