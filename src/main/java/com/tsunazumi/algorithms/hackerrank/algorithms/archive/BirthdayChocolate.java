package com.tsunazumi.algorithms.hackerrank.algorithms.archive;

import java.util.Arrays;
import java.util.List;

public class BirthdayChocolate {
  public static void main(String[] args) {
    int day = 18;
    int month = 7;
    List<Integer> bar = Arrays.asList(2, 5, 1, 3, 4, 4, 3, 5, 1, 1, 2, 1, 4, 1, 3, 3, 4, 2, 1);
    System.out.println(birthday(bar, day, month));

  }
  static int birthday(List<Integer> s, int d, int m) {
    // find continuous elements that sum to d and count to m
    Integer[] arr = s.toArray(new Integer[0]);
    int matches = 0;
    for (int i=0; i < arr.length; i++) {
      int sum = 0;
      for (int j = i; j-i < m && j != arr.length; j++) {
        sum += arr[j];
      }
      if (sum == d) {
        matches++;
      }
    }
    return matches;


  }




  }
