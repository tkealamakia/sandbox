package com.tsunazumi.dsa.hackerrank.algorithms.archive;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MigratoryBirds {

  public static void main(String[] args) {
    List<Integer> birds = Arrays.asList(1,2,3,4,5,4,3,2,1,3,4);
    int bird = migratoryBirds(birds);
    System.out.println(bird);
  }

  static int migratoryBirds(List<Integer> arr) {
    Map<Integer, Long> result =
        arr.stream().collect(
            Collectors.groupingBy(
                Function.identity(), Collectors.counting()
            )
        );

    Map<Integer, Long> descResult = new TreeMap<Integer, Long>(Collections.reverseOrder());
    descResult.putAll(result);
    System.out.println(result);
    System.out.println(descResult);

    int winner = 0;
    long high = 0;
    for (Integer i : descResult.keySet()) {
      if (descResult.get(i) >= high) {
        winner = i;
        high = descResult.get(i);
      }
    }
    return winner;
  }
}
