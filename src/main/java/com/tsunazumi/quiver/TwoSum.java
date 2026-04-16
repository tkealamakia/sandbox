package com.tsunazumi.quiver;

import java.util.*;

public class TwoSum {
  public static void main(String[] args) {
    int[] nums = {1,2,4,4};
    int[] result = returnTwoSumIndexes(nums, 8);
    for (int i : result) {
      System.out.println(i);
    }
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
