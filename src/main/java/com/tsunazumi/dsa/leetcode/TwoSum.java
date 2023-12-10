package com.tsunazumi.dsa.leetcode;

import java.util.*;

public class TwoSum {
  public static void main(String[] args) {
    int[] nums = {3,2,4};
    int needle = 6;

    int[] result = getTwoSumBetter(nums, needle);
    Arrays.stream(result).forEach(System.out::println);

  }

  static int[] getTwoSum(int[] nums, int target) {
    int[] result = new int[2];
    for (int i = 0; i < nums.length; i++) {
      int current = nums[i];
      for (int j = i + 1; j < nums.length; j++) {
        if (current + nums[j] == target) {
          result[0] = i;
          result[1] = j;
        }
      }
    }
    return result;
  }

  static int[] getTwoSumBetter(int[] nums, int target) {
    int[] result = new int[2];
    Map<Integer, Integer> complementMap = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int complement = target - nums[i];
      if (complementMap.containsKey(complement)) {
        result[0] = complementMap.get(complement);
        result[1] = i;
      } else {
        complementMap.put(nums[i], i);
      }
    }
    return result;
  }
}
