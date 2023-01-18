package com.tsunazumi.dsa.hackerrank.algorithms.archive;

public class CountingValleys {
  public static void main(String[] args) {
    String arr = "UDDDUDUU";
    char[] chars = arr.toCharArray();
    int fromSeaLevel = 0;
    boolean wasFromBelow = false;
    for (int i = 0; i < chars.length; i++) {
      if (chars[i] == 'U') {
        if (fromSeaLevel == -1) {
          wasFromBelow = true;
        }
        fromSeaLevel++;
      }
      if (chars[i] == 'D') {
        fromSeaLevel--;
      }
      if (fromSeaLevel == 0 & wasFromBelow) {
        System.out.println(i);
        System.out.println("sea level reached");
      }
      wasFromBelow = false;
    }
  }
}
