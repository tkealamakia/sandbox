package com.tsunazumi.quiver;

import java.util.*;

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
      // Accumulate the numbers we have seen so we don't have to go over the list every time
      set.add(i);
    }
    return false;
  }

  public static int[] returnTwoSumIndexes(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i=0; i < nums.length; i++) {
      int complement = target - nums[i];
      if (map.containsKey(complement)) {
        return new int[] {map.get(complement), i};
      }
      map.put(nums[i], i);
    }
    return null;
  }
}
