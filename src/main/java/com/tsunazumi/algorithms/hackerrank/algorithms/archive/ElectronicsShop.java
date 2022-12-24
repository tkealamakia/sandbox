package com.tsunazumi.algorithms.hackerrank.algorithms.archive;

import java.util.ArrayList;
import java.util.List;

public class ElectronicsShop {

  public static void main(String[] args) {
//    int[] keyboards = {3, 1};
//    int[] drives = {5, 2, 8};
//    int budget = 10;
    int[] keyboards = {4};
    int[] drives = {5};
    int budget = 5;
    System.out.println(getMoneySpent(keyboards, drives, budget));
  }

  static int getMoneySpent(int[] keyboards, int[] drives, int b) {
    int closest = 0;
    List<Integer> totals = new ArrayList<>();
    for (int i = 0; i < keyboards.length; i++) {
      for (int j = 0; j < drives.length; j++) {
        totals.add(keyboards[i] + drives[j]);
      }
    }
    return findMostExpensiveAndLessThan(totals, b);
  }

  static int findMostExpensiveAndLessThan(List<Integer> totals, int budget) {
    int mostExpensive = -1;
    for (Integer i : totals) {
      if (i > mostExpensive && i <= budget) {
        mostExpensive = i;
      }
    }
    return mostExpensive;
  }
}
