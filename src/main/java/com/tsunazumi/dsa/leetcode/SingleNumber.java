package com.tsunazumi.dsa.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
  public static void main(String[] args) {
    int[] nums = {1};
    System.out.println(singleNumber(nums));
  }

  public static int singleNumber(int[] nums) {
    Map<Integer, Integer> map = new HashMap<>();
    Arrays.stream(nums).forEach(e -> {
      if (map.containsKey(e)) {
        map.remove(e);
      } else {
        map.put(e, 1);
      }
    });
    return map.keySet().iterator().next();
  }
}
