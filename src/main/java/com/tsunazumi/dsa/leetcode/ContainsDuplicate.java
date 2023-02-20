package com.tsunazumi.dsa.leetcode;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

  public static void main(String[] args) {
    int[] nums = new int[] {1,2,3,4};
    System.out.println(containsDuplicates(nums));
  }

  public static boolean containsDuplicates(int[] nums) {
    Set<Integer> numSet = new HashSet<>();
    for (int i=0; i < nums.length; i++) {
      if (numSet.contains(nums[i])) {
        return true;
      }
      numSet.add(nums[i]);
    }
    return false;
  }
}
