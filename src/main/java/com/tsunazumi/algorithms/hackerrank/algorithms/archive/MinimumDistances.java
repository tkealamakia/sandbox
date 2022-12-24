package com.tsunazumi.algorithms.hackerrank.algorithms.archive;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumDistances {

  public static void main(String[] args) {
    List<Integer> ints = Arrays.asList(7,1,3,4,1,7);
    int result = minimumDistances(ints);
    System.out.println(result);
  }

  public static int minimumDistances(List<Integer> list) {
    // check if the value has been seen
    // for each value record the position and put it into a map
    int result = -1;
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < list.size(); i++) {
      int alreadySeen = list.get(i);
      if (map.containsKey(alreadySeen)) {
        int newValue = i - map.get(alreadySeen);
        if (result == -1 || newValue < result) {
          result = newValue;
        }
      } else {
        map.put(list.get(i), i);
      }
    }
    return result;


  }
}
