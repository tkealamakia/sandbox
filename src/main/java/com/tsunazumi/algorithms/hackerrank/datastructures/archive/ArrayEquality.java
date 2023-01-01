package com.tsunazumi.algorithms.hackerrank.datastructures.archive;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayEquality {

  public static int equalizeArray(List<Integer> arr) {
    // Count instances
    Map<Integer, Integer> map = new HashMap<>();
    for (Integer i : arr) {
      Integer f = map.get(i);
      if (f == null) {
        map.put(i, 1);
      } else {
        map.put(i, ++f);
      }
    }

    int biggest = 0;
    for (Integer value : map.values()) {
      if (value > biggest) {
        biggest = value;
      }
    }
    return arr.size() - biggest;
  }

  public static void main(String[] args) {
    List<Integer> arr = Arrays.asList(3, 3, 2, 1, 3);
    System.out.println(equalizeArray(arr));
  }
}
