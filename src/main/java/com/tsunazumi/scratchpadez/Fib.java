package com.tsunazumi.scratchpadez;

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
    return 0;
  }
}
