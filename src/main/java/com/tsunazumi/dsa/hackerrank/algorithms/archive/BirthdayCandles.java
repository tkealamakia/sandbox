package com.tsunazumi.dsa.hackerrank.algorithms.archive;

public class BirthdayCandles {

  public static void main(String[] args) {

    int[] ar = {1,3,3,3};

    int max = 0;
    for (int i = 0; i < ar.length; i++) {
      if (ar[i] > max) {
        max = ar[i];
      }
    }
    int count = 0;
    for (int i = 0; i < ar.length; i++) {
      if (max == ar[i]) {
        count++;
      }
    }
    System.out.println(count);

  }
}
