package com.tsunazumi.misc;

import java.util.Arrays;
import java.util.List;

public class CanSum {
  public static void main(String[] args) {
    int n = 7;
    List<Integer> list = Arrays.asList(3,5);
    System.out.println(canSum(7, list));
  }

  public static boolean canSum(int n, List<Integer> list) {
    if (n == 0) return true;
    if (n < 0)  return false;

    for (int i : list) {
      if (canSum(n - i, list) == true) {
        return true;
      }
    }
    return false;
  }

}
