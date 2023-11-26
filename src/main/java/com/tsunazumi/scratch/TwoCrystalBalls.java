package com.tsunazumi.scratch;

public class TwoCrystalBalls {
  public static void main(String[] args) {
    boolean[] breaks = {false, false, false, true, true, true, true};
    System.out.println(lowestFloor(breaks));
  }

  static int lowestFloor(boolean[] breaks) {
    int jump = (int)Math.floor(Math.sqrt(breaks.length));
    int i = 0;
    for (; i < breaks.length; i += jump) {
      if (breaks[i]) {
        break;
      }
    }
    i -= jump;

    for (int j = i; j < breaks.length; j++) {
      if (breaks[j]) {
        return j;
      }
    }

    return -1;
  }
}
