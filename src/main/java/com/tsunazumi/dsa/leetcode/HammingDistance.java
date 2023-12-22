package com.tsunazumi.dsa.leetcode;

public class HammingDistance {

  public static void main(String[] args) {
    System.out.println(hammingDistance(1, 4));
  }
  public static int hammingDistance(int x, int y) {
    int distance = 0;
    int xor = x ^ y;

    while (xor != 0) {
      distance += xor & 1;
      xor >>= 1;
    }

    return distance;
  }
}
