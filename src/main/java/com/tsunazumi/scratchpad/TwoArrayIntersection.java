package com.tsunazumi.scratchpad;

import java.util.*;
import java.util.stream.Collectors;

// make an array out of only common numbers between the two
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
    return null;
  }
}