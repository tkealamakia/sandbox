package com.tsunazumi.scratch;

import java.util.*;

public class CanSum {
  public static void main(String[] args) {
    int n = 7;
//    List<Integer> list = Arrays.asList(7,14);
    List<Integer> list = Arrays.asList(2,3,1,2,4,3);
    List<Integer> result = new ArrayList<>();
    Map<Integer, Boolean> memo = new HashMap<>();
    System.out.println(canSum(7, list, memo));
  }

  static boolean canSum(int targetSum, List<Integer> list, Map<Integer, Boolean> memo) {
    if (memo.containsKey(targetSum)) { return memo.get(targetSum); }
    if (targetSum == 0) { return true; }
    if (targetSum < 0) { return false; }
    for (Integer i : list) {
      if (canSum(targetSum - i, list, memo)) {
        memo.put(targetSum, true);
        return true;
      }
    }
    memo.put(targetSum, false);
    return false;
  }
}
