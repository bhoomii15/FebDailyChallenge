package com.feb;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class Feb25 {
    public static void main(String[] args) {

    }

    static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;

        for(int i =0; i < prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
            } else if(prices[i] - min > max){
                max = prices[i] - min;
            }
        }

        return max;
    }
}
