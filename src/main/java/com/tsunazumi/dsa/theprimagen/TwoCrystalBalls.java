package com.tsunazumi.dsa.theprimagen;

public class TwoCrystalBalls {
  public static void main(String[] args) {
    boolean[] breaks = {false, false, false, true, true, true, true};
    System.out.println(lowestFloor(breaks));

  }

  public static int lowestFloor(boolean[] breaks) {
    final int jumpAmt = (int) Math.floor(Math.sqrt(breaks.length));
    int i = jumpAmt;
    for(; i < breaks.length; i += jumpAmt) {
      if (breaks[i]) {
        break;
      }
    }
    i -= jumpAmt;

    for(int j = i; j < breaks.length; j++) {
      if (breaks[j]) {
        return j;
      }
    }
    return -1;

  }
}
