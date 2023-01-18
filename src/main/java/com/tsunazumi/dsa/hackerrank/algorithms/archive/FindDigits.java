package com.tsunazumi.dsa.hackerrank.algorithms.archive;

public class FindDigits {
  public static void main(String[] args) {
    System.out.println(findDigits(10));
  }

  public static int findDigits(int n) {
    int result = 0;
    String num = String.valueOf(n);
    for (Character s : num.toCharArray()) {
      int foo = Integer.parseInt(s.toString());
      if (foo == 0) { continue; }
      if (n % foo == 0) {
        result++;
      }
    }
    return result;
  }
}
