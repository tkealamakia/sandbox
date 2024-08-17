package com.tsunazumi.quiver;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

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

  public static boolean isTwoSumMyWay(int[] nums, int sum) {
    Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
    for (int i : nums) {
      if (set.contains(sum - i)) {
        return true;
      }
    }
    return false;
  }
}
