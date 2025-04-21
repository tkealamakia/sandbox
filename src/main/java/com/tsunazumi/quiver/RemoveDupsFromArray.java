package com.tsunazumi.quiver;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDupsFromArray {
  public static void main(String[] args) {
    int[] array = {1,2,3,4,1,2,4};
    Integer[] result = removeDups(array);
    for (Integer i : result) {
      System.out.print(i);
    }
    System.out.println();
    int[] result2 = removeDups2(array);
    for (Integer i : result2) {
      System.out.print(i);
    }
  }

  private static Integer[] removeDups(int[] array) {
    Set<Integer> set = new LinkedHashSet<>();
    for (int i : array) {
      set.add(i);
    }
    return set.toArray(new Integer[0]);
  }

  private static int[] removeDups2(int[] array) {
    return Arrays
        .stream(array)
        .boxed()
        .collect(Collectors.toSet())
        .stream()
        .mapToInt(Integer::intValue)
        .toArray();
  }
}
