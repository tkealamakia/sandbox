package com.tsunazumi.quiver;

import java.util.*;
import java.util.stream.Collectors;

public class TwoSum {
  public static void main(String[] args) {
    int[] nums = {1,2,4,4};
    System.out.println(isTwoSum(nums, 8));
  }

  // Returning the pairs rather than just a boolean
//  public static List<Map.Entry<Integer,Integer>> isTwoSum(int[] nums, int sum) {
//    Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
//    List<Map.Entry<Integer,Integer>> result = new ArrayList<>();
//
//    for (int i : nums) {
//      if (set.contains(sum-i)) {
//        // Check if the reverse already exists
//        Map.Entry<Integer, Integer> pair = new AbstractMap.SimpleEntry<>(sum-i, i);
//        if (!result.contains(pair)) {
//          Map.Entry<Integer, Integer> resultPair = new AbstractMap.SimpleEntry<>(i, sum - i);
//          result.add(resultPair);
//        }
//      }
//    }
//    return result;
//  }

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
}
