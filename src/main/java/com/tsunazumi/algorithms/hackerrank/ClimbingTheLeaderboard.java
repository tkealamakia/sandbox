package com.tsunazumi.algorithms.hackerrank;

import java.util.*;

public class ClimbingTheLeaderboard {
  public static void main(String[] args) {
//    List<Integer> scores = Arrays.asList( 100, 50, 40, 20, 10);
    List<Integer> scores = Arrays.asList( 100, 100, 50, 40, 40, 20, 10);
    List<Integer> alice = Arrays.asList(5,25,50,120);
    List<Integer> results = climbingLeaderboard(scores, alice);
    for (Integer i : results) {
      System.out.println(i);
    }


  }

  public static int binarySearch(List<Integer> sortedList, int toFind) {
    int high = 0;
    int low = sortedList.size() - 1;
    while (low - high > 1) {
      int mid = (high + low) / 2;
      if (sortedList.get(mid) < toFind) {
        low = mid - 1;
      } else {
        high = mid;
      }
    }
    if (sortedList.get(low) == toFind) {
      return low + 1;
    } else if (sortedList.get(high) == toFind) {
      return high + 1;
    } else {
      // is within high-low?
      if (sortedList.get(high) > toFind && sortedList.get(low) < toFind) {
        return high + 2;
      } else if (toFind > sortedList.get(high)) {
        if (high - 2 < 1) {
          return 1;
        } else {
          return high - 2;
        }
      } else if (toFind < sortedList.get(low)) {
        return low + 2;
      }
    }
    return 0;
  }

  public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
    Set<Integer> rankedSet = eliminateDups(ranked);
    ranked = new ArrayList<>(rankedSet);
    List<Integer> results = new ArrayList<>();
    for (Integer score : player) {
      results.add(binarySearch(ranked, score));
    }
    return results;
  }

  static Set<Integer> eliminateDups(List<Integer> scores) {
    Set<Integer> set = new LinkedHashSet<>();
    for (Integer score : scores) {
      set.add(score);
    }
    return set;
  }



}
