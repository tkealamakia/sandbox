package com.tsunazumi.atlassian.answers;

import com.tsunazumi.dsa.crackingCodingInterview.Cc33;
import com.tsunazumi.dsa.theprimagen.Queue;

import java.util.Stack;

public class StockSpan {
  public static void main(String[] args) {
    int[] prices = {100,80,60,70,60,75,85};
//    int[] prices = {10,4,5,90,120,80};
    Stack<Integer> stack = new Stack<>();

    Outer:
    for (int i = prices.length-1; i > 0; i--) {
      int count = 1;
      for (int j = i - 1; j >= 0; j--) {
        if (prices[i] > prices[j]) {
          count++;
        } else {
          stack.push(count);
          continue Outer;
        }
      }
      stack.push(count);
    }
    stack.push(1);

    stack.stream().forEach(System.out::println);
  }
}
