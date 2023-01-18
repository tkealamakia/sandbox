package com.tsunazumi.dsa.hackerrank.algorithms.archive;

public class ViralAds {
  public static void main(String[] args) {
    System.out.println(viralAdvertising(3));
  }


  public static int viralAdvertising(int n) {
    // loop 5 times
    int cumalative = 0;
    int shared = 5;
    double liked = 2;
    for (int i=1; i <= n; i++) {
      liked = Math.floor(shared/2);
      shared = (int) (liked * 3);
      cumalative += liked;
    }
    return cumalative;

  }
}
