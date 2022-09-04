package com.tsunazumi.algorithms.hackerrank.algorithms;

public class Steps {
  public static void main(String[] args) {
    int n = 6;
    for (int i = 1; i < n; i++) {
      int j = i;
      while (j < n) {
        System.out.print(" ");
        j++;
      }
      System.out.print("#");
      while (j != n + i) {
        System.out.print("#");
        j++;
      }
      System.out.println();

    }
  }
}
