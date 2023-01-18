package com.tsunazumi.dsa.freecodecamp;

import java.util.HashMap;
import java.util.Map;

public class CanSum {
  public static void main(String[] args) {
    Map<Integer, Boolean> memo = new HashMap<>();
    boolean result = canSum(7, new int[]{4,3,2,1}, memo);
    System.out.println(result);
    Map<Integer, Boolean> memo2 = new HashMap<>();
    result = canSum(8, new int[]{2,3,5}, memo2);
    System.out.println(result);
    Map<Integer, Boolean> memo3 = new HashMap<>();
    result = canSum(300, new int[]{7,14}, memo3);
    System.out.println(result);

  }

  public static boolean canSum(int targetSum, int[] numbers, Map<Integer, Boolean> memo) {
    if (memo.containsKey(targetSum)) { return memo.get(targetSum); }
    if (targetSum == 0)  return true;
    if (targetSum < 0) return false;

    for (int i=0; i < numbers.length; i++) {
      int remainder = targetSum - numbers[i];
//      if (canSum(remainder, numbers, memo) == true) {
//        memo.put(targetSum, true);
//        return true;
//      }
      memo.put(targetSum, canSum(remainder, numbers, memo));
      if (memo.get(targetSum) == true) {
        return true;
      }
    }
    return false;
  }
}
