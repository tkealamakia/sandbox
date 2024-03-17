package com.tsunazumi.quiver;

public class TwoCrystalBalls {
  public static void main(String[] args) {
    boolean[] breaks = {false, false, false, true, true, true, true};
    System.out.println(lowestFloor(breaks));

  }

  public static int lowestFloor(boolean[] breaks) {
    // find the jump
    int jump = (int) Math.floor(Math.sqrt(breaks.length));
    int i = jump;
    for (; i < breaks.length; i += jump) {
      if (breaks[i]) {
        break;
      }
    }

    // jump back
    i -= jump;
    for (int j = i; j < breaks.length; j++) {
      if (breaks[j]) {
        return j;
      }
    }
    return -1;
  }

  static int lowestFloorAlt(boolean[] breaks) {
    int jump = (int)Math.floor(Math.sqrt(breaks.length));

    while (!breaks[jump]) {
      jump += jump;
    }

    jump -= jump;

    for (int i = jump; i < breaks.length; i++) {
      if (breaks[i]) {
        return i;
      }
    }

    return -1;
  }
}
