package com.tsunazumi.quiver;

import java.util.HashSet;
import java.util.Set;

public class TwoSum {
  public static void main(String[] args) {
    int[] nums = {1,2,4,4};
    System.out.println(isTwoSum(nums, 8));
  }

  public static boolean isTwoSum(int[] nums, int sum) {
    Set<Integer> set = new HashSet<>();
    for (int i : nums) {
      if (set.contains(sum - i)) {
        return true;
      }
      set.add(i);
    }
    return false;
  }
}
