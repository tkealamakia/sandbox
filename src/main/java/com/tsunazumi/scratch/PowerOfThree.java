package com.tsunazumi.scratch;


public class PowerOfThree {
  public static void main(String[] args) {
    System.out.println(isPowerOfThree(27));
  }

  static boolean isPowerOfThree(int i) {
    if (i < 0) {
      return false;
    }
    if (i == 0) {
      return true;
    }
    return (isPowerOfThree(i - 3));
  }
}
