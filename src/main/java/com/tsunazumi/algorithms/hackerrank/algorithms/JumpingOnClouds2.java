package com.tsunazumi.algorithms.hackerrank.algorithms;

public class JumpingOnClouds2 {

  public static void main(String[] args) {
    int[] c = {1, 1, 1, 0, 1, 1, 0, 0, 0, 0};
    int k = 3;
//    int[] c = {0, 0, 1, 0, 0, 1, 1, 0};
//    int k = 2;
    System.out.println(jumpingOnClouds(c, k));
  }

  static int jumpingOnClouds(int[] c, int k) {
    int e = 100;
    int n = c.length;
    int ci = 0;

    // Have to keep going and wrapping around until
    // we get back to index 0
    do {
      if (c[(ci+k) % n] == 1) {
        e -= 2;
      }
      e--;
      ci = (ci+k) % n;
    } while (ci != 0);
    return e;
  }
}
