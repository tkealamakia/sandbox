package com.tsunazumi.algorithms.freecodecamp;

import java.util.HashMap;
import java.util.Map;

public class Fib {
  public static void main(String[] args) {
    Map<Long, Long> memo = new HashMap<>();
    System.out.println(fib(6));
    System.out.println(fibMemo(89, memo));
  }

  public static long fib(long n) {
    if (n <= 2) return 1;
    return fib(n-1) + fib(n-2);
  }

  public static long fibMemo(long n, Map<Long, Long> map) {
    if (map.containsKey(n)) return map.get(n);
    if (n <= 2) return 1;
    map.put(n, fibMemo(n-1,map) + fibMemo(n-2,map));
    return map.get(n);
  }
}
