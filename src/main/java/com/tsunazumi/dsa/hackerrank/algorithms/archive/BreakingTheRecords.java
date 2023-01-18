package com.tsunazumi.dsa.hackerrank.algorithms.archive;

public class BreakingTheRecords {

  public static void main(String[] args) {
    int[] scores = {10, 5, 20, 20, 4, 5, 2, 25, 1};
    int[] results = breakingRecords(scores);
    for (int i : results) {
      System.out.println(i);
    }

  }

  static int[] breakingRecordsStream(int[] scores) {
    int [] results = {0, 0};
    int max = scores[0];
    int min = scores[0];
    for (int i : scores) {
      if (i < min) {
        results[1] = results[1] + 1 ;
        min = i;
      }
      if (i > max) {
        results[0] = results[0] + 1;
        max = i;
      }
    }
    return results;
  }

  static int[] breakingRecords(int[] scores) {
    int [] results = {0, 0};
    int max = scores[0];
    int min = scores[0];
    for (int i : scores) {
      if (i < min) {
        results[1] = results[1] + 1 ;
        min = i;
      }
      if (i > max) {
        results[0] = results[0] + 1;
        max = i;
      }
    }
    return results;
  }
}
