package com.tsunazumi.algorithms.hackerrank.algorithms.twentythree;

import java.util.Arrays;
import java.util.List;

public class NonDivisibleSubset {

  public static void main(String[] args) {
    List<Integer> s = Arrays.asList(19, 10, 12, 10, 24, 25, 22);
    int k = 4;
    System.out.println(nonDivisibleSubset(k, s));
  }
  public static int nonDivisibleSubset(int k, List<Integer> s) {
    int[] remainderCounts = new int[k];
    for (int i : s) {
      remainderCounts[i % k] += 1;
    }

    int maxnum = 0;
    // O position is the count of all evenly divisible numbers
    maxnum += Math.min(remainderCounts[0], 1);

    // Even number handling
    if (k % 2 == 0) {
      maxnum += Math.min(remainderCounts[k/2], 1);
    }

    for (int i = 1; i <= k/2; i++) {
      if (i != k-i) {
        maxnum += Math.max(remainderCounts[i], remainderCounts[k-i]);
      }
    }
    return maxnum;
  }
}
