package com.tsunazumi.quiver;

import java.util.HashMap;
import java.util.Map;

public class TwoArrayIntersection {

  public static void main(String[] args) {
    int[] nums1 = {4, 6, 7, 7, 3};
    int[] nums2 = {3, 7, 9, 8, 7};
    int[] result = findIntersection(nums1, nums2);
    for (int i : result) {
      System.out.println(i);
    }
  }

  private static int[] findIntersection(int[] nums1, int[] nums2) {
    Map<Integer, Boolean> intersection = new HashMap<>();
    for (int i : nums1) {
      if (!intersection.containsKey(i)) {
        intersection.put(i, false);
      }
    }
    for (int i : nums2) {
      if (intersection.containsKey(i)) {
        intersection.put(i, true);
      }
    }

    int[] result = intersection.keySet().stream()
        .filter(v -> intersection.get(v))
        .mapToInt(Integer::intValue).toArray();

    return result;
  }
}
