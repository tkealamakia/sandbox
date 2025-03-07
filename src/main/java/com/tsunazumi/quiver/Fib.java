package com.tsunazumi.quiver;

import java.util.HashMap;
import java.util.Map;

public class Fib {
  public static void main(String[] args) {
    Map<Integer, Integer> memo = new HashMap<>();
    // Remember fib(5) = fib(4) + fib (3)
    // we get the answer by adding all the base cases up
    System.out.println(fib(7, memo));
  }

  public static int fib(int num, Map<Integer, Integer> memo) {
    if (memo.containsKey(num)) {
      return memo.get(num);
    }
    if (num == 1) {
      return 1;
    }
    if (num == 2) {
      return 2;
    }
    memo.put(num,fib(num -1, memo) + fib(num - 2, memo));
    return memo.get(num);
  }
}
