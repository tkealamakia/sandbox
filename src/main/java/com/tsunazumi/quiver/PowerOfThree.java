package com.tsunazumi.quiver;

public class PowerOfThree {
  public static void main(String[] args) {
    boolean result = isPowerOfThree(27);
    System.out.println(result);
  }

  static boolean isPowerOfThree(int i) {
    // 0 and negative numbers cannot be powers of three
    if (i <= 0) {
      return false;
    }
    // Base case: If i is 1, it is a power of three (3^0)
    if (i == 1) {
      return true;
    }
    // If i is not divisible by 3, it's not a power of three
    if (i % 3 != 0) {
      return false;
    }
    return isPowerOfThree(i / 3);
  }

}
