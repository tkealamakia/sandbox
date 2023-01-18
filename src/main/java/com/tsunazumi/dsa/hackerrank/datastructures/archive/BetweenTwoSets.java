package com.tsunazumi.dsa.hackerrank.datastructures.archive;


import java.util.*;

public class BetweenTwoSets {

  public static void main(String[] args) {
    List<Integer> a = Arrays.asList(1);
    List<Integer> b = Arrays.asList(100);
    //List<Integer> a = Arrays.asList(2, 6);
    //List<Integer> b = Arrays.asList(24, 36);
    System.out.println(getTotalX(a, b));
  }

  public static int getTotalX(List<Integer> a, List<Integer> b) {

    int count = 0;
    SortedSet<Integer> intSet = new TreeSet<>();
    intSet.addAll(a);
    intSet.addAll(b);
    int first = intSet.first();
    int last = intSet.last();
    Map<Integer, Integer> mapCount = new HashMap<>();
    for (int i = first; i <= last; i++) {
      isAFactor(i, a, b, mapCount);
    }

    for (int j : mapCount.keySet()) {
      if (mapCount.get(j) >= intSet.size()) {
        count++;
      }
    }
    return count;
  }

  private static void isAFactor(int i, List<Integer> lista, List<Integer> listb, Map<Integer, Integer> mapCount) {
    for (int j : lista) {
      if (i == j) {
        popMap(i, mapCount);
        continue;
      }
      if (i%j != 0) {
        return;
      }
      popMap(i, mapCount);
    }
    for (int j : listb) {
      if (i == j) {
        popMap(i, mapCount);
        continue;
      }
      if (j%i != 0) {
        return;
      }
      popMap(i, mapCount);
    }
    return;
  }

  private static void popMap(int i, Map<Integer, Integer> mapCount) {
    if (mapCount.containsKey(i)) {
      mapCount.put(i, mapCount.get(i) + 1);
    } else {
      mapCount.put(i, 1);
    }
  }
}
