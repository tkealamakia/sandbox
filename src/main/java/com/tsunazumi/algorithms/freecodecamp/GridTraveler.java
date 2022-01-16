package com.tsunazumi.algorithms.freecodecamp;

import java.util.HashMap;
import java.util.Map;

public class GridTraveler {
  public static void main(String[] args) {
    Map<String, Long> memo = new HashMap<>();
    long result = gridTraveler(18,18, memo);
    System.out.println(result);

  }

  public static long gridTraveler(int x, int y, Map<String, Long> memo) {
    String xy = x + "," + y;
    if (memo.containsKey(xy)) { return memo.get(xy); }
    if (x == 0 || y == 0) { return 0; }
    if (x == 1 && y == 1) { return 1; }
    memo.put(xy,gridTraveler(x-1, y, memo) + gridTraveler(x, y-1, memo));
    return memo.get(xy);
  }
}
