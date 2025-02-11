package com.tsunazumi.quiver;

import java.util.*;

public class TwoArrayIntersection {

  public static void main(String[] args) {
    int[] nums1 = {4, 6, 7, 7, 3};
    int[] nums2 = {3, 7, 9, 8, 7};
    int[] result = findIntersection(nums1, nums2);
    Arrays.stream(result).forEach(System.out::println);
  }

  private static int[] findIntersection(int[] nums1, int[] nums2) {
    Set<Integer> set1 = new HashSet<>();
    for (int i : nums1) {
      set1.add(i);
    }
    Set<Integer> set2 = new HashSet<>();
    for (int i : nums2) {
      if (set1.contains(i)) {
        set2.add(i);
      }
    }

    return set2.stream().mapToInt(Integer::intValue).toArray();
  }
}
