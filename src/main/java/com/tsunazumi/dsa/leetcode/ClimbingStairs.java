package com.tsunazumi.dsa.leetcode;

import java.util.HashMap;
import java.util.Map;

public class ClimbingStairs {

  public static void main(String[] args) {
    System.out.println(climbStairs(45));
  }

  public static int climbStairs(int n) {
    Map<Integer, Integer> memo = new HashMap<>();
    int result = climb(n, memo);
    return result;
  }

  public static int climb(int n, Map<Integer, Integer> memo) {
    if (n <= 2) {
      return n;
    }
    if (memo.containsKey(n)) {
      return memo.get(n);
    }

    memo.put(n, climb(n-1, memo) + climb(n-2, memo));

    return memo.get(n);
  }

}
