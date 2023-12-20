package com.tsunazumi.quiver;

public class PowerOfThree {
  public static void main(String[] args) {
    boolean result = isPowerOfThree(-1);
    System.out.println(result);
  }

  static boolean isPowerOfThree(int i) {
    // Divide by 3 repeatedly until the base case of 1
    if (i == 0) {
      return false;
    }
    if (i == 1) {
      return true;
    }
    if (i % 3 > 0) {
      return false;
    }
    return isPowerOfThree(i / 3);

  }

}
