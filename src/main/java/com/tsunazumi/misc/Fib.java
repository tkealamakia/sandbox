package com.tsunazumi.misc;


import java.util.HashMap;
import java.util.Map;

public class Fib {

  public static void main(String[] args) {
    // Find what number is at position n in a fibonnaci sequence
    Map<Long, Long> memo = new HashMap<>();
    System.out.println(fib(58, memo));
  }

  public static long fib(long n, Map<Long, Long> memo) {
    if (memo.containsKey(n)) {
      return memo.get(n);
    }

    if (n <= 2) {
      return 1;
    }
    memo.put(n, fib(n - 1, memo) + fib(n - 2, memo));
    return memo.get(n);
  }
}
