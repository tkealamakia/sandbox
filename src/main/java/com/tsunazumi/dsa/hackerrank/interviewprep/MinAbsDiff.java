package com.tsunazumi.dsa.hackerrank.interviewprep;

import java.util.*;

public class MinAbsDiff {

  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1,-3,71,68,17);
    int result = minimumAbsoluteDifference(list);
    System.out.println(result);
  }

  public static int minimumAbsoluteDifference(List<Integer> arr) {
    Collections.sort(arr);

    Integer[] list = new Integer[arr.size()];

    arr.toArray(list);

    SortedSet<Integer> sortedSet = new TreeSet<>();

    for (int i=0; i < list.length-1; i++) {
      int diff = Math.abs(list[i] - list[i+1]);
      sortedSet.add(diff);
    }

    return sortedSet.first();

  }
}
