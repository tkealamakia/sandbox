package com.tsunazumi.algorithms.hackerrank.datastructures.archive;

import java.util.*;

public class SparseArrays {

  public static void main(String[] args) {
    List<String> stringList = Arrays.asList("def", "de", "fgh");
    List<String> queries = Arrays.asList("de", "lmn", "fgh");

    List<Integer> result = matchingString(stringList, queries);
    System.out.println(result);
  }

  public static List<Integer> matchingString(List<String> stringList, List<String> queries) {
    // Convert stringList into something easy to lookup like a set
    Map<String, Integer> map = new LinkedHashMap<>();
    for (String s : stringList) {
      // check if we have the value, if we do increment the count
      Integer i = map.get(s);
      if (i != null) {
        map.put(s, i + 1);
      // if we don't add the value to the map with a count of 1
      } else {
        map.put(s, 1);
      }
    }
    List<Integer> result = new ArrayList<>();
    for (String s : queries) {
      if (map.containsKey(s)) {
        result.add(map.get(s));
      } else {
        result.add(0);
      }
    }
    return result;
  }
}
