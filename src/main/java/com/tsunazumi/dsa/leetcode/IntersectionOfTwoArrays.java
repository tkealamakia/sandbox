package com.tsunazumi.dsa.leetcode;

import java.util.*;

public class IntersectionOfTwoArrays {
  public static void main(String[] args) {
//    int[] i1 = new int[]{1,2,2,1};
//    int[] i2 = new int[]{2,2};
    int[] i1 = new int[]{9,4,9,8,4};
    int[] i2 = new int[]{4,9,5};
    intersect(i1, i2);

  }

  public static int[] intersect(int[] nums1, int[] nums2) {
    Map<Integer, Integer> longer = new HashMap<>();
    List<Integer> list = new ArrayList<>();
    // make nums1 the longer array
    if (nums1.length < nums2.length) {
      int[] temp = nums1;
      nums1 = nums2;
      nums2 = temp;
    }
    // create map out of longer array
    for (int i=0; i < nums1.length; i++) {
      longer.compute(nums1[i], (key, value) -> (value == null) ? 1 : value + 1);
    }
    // using the second array decrement each seen position and add it to the result list
    for (int i=0; i < nums2.length; i++) {
//      longer.compute(nums2[i], (key, value) -> (value == null) ? 0 : value - 1);
      Integer foo = longer.get(nums2[i]);
      if (foo != null && foo > 0) {
        longer.put(nums2[i], foo -1);
        list.add(nums2[i]);
      }
    }
    // Decrement the map values with the second array
    System.out.println(list);
    return list.stream()
        .mapToInt(Integer::intValue)
        .toArray();
  }
}
