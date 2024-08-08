package com.tsunazumi.quiver;

import java.util.*;

public class RemoveDupsFromArray {
  public static void main(String[] args) {
    int[] array = {1,2,3,4,1,2,4};
    Integer[] result = removeDups(array);
    for (Integer i : result) {
      System.out.println(i);
    }
  }

  private static Integer[] removeDups(int[] array) {
    Set<Integer> set = new LinkedHashSet<>();
    for (int i : array) {
      set.add(i);
    }
    return set.toArray(new Integer[0]);
  }
}
