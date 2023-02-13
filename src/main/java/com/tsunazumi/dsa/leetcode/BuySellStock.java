package com.tsunazumi.dsa.leetcode;

public class BuySellStock {
  public static void main(String[] args) {
//    int[] prices = new int[] {7,1,5,3,6,4};
    int[] prices = new int[] {1,2,3,4,5};
    System.out.println(maxProfit(prices));
  }

  public static int maxProfit(int[] prices) {
    // loop through the array comparing the current value with the next
    int total = 0;
    int currentHoldings = 0;
    boolean buyMode = true;
    for (int i=0; i < prices.length; i++) {
      int current = prices[i];
      // If we are on the last loop
      // either sell or do nothing
      if (i == prices.length - 1 ) {
        // buy this last one
        if (!buyMode) {
          int gains = current - currentHoldings;
          total += gains;
        }
        continue;
      }
      int next = prices[i+1];
      // BUY!
      if (current < next && buyMode) {
        buyMode = false;
        currentHoldings = prices[i];
      }
      // SELL!
      if (!buyMode &&
          (currentHoldings < current &&
          current > next) || i == prices.length +1 ) {
        int gains = current - currentHoldings;
        total += gains;
        buyMode = true;
      }
    }
    return total;
  }
}
