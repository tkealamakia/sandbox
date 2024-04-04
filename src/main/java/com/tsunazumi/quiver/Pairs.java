package com.tsunazumi.quiver;

import java.util.HashSet;
import java.util.Set;

public class Pairs {
  public static void main(String[] args) {
    int[] nums = {9,3,9,3,9,7,9};
    System.out.println(findNonPair(nums));

  }

  public static int findNonPair(int[] nums) {
    Set<Integer> set = new HashSet<>();
    for (int num : nums) {
      if (set.contains(num)) {
        // pair found so remove it
        set.remove(num);
      } else {
        set.add(num);
      }
    }
    return set.iterator().next();
  }
}
