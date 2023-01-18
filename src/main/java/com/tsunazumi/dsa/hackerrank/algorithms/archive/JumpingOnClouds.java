package com.tsunazumi.dsa.hackerrank.algorithms.archive;

public class JumpingOnClouds {
  public static void main(String[] args) {
    //int[] c = { 0, 1, 0, 1, 0, 0 };
    //int[] c = { 0, 0, 1, 0, 0, 1, 0 };
    //int[] c = { 0, 0, 0, 1, 0, 0 };
    int[] c = { 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0 };

    int jumps = 0;
    int spacesTraversed = 0;
    for (int i = 0; i < c.length; i++) {
      if (i == c.length-1 && c[i] == 0) {
        jumps++;
        break;
      }
      if (spacesTraversed == 2) {
        if (c[i] == 1) {
          jumps++;
          spacesTraversed--;
          i--;
          continue;
        } else {
          jumps++;
          spacesTraversed = 1;
          continue;
        }
      }
      spacesTraversed++;
    }

    /*
    for (int i = 0; i < c.length; i++) {
      if (c[i] == 0) {
        if (i != c.length-1 && c[i+1] == 1
            || spacesTraversed == 2
            || i == c.length - 1) {
          jumps++;
          spacesTraversed = 0;
        }
      }
      spacesTraversed++;

    }
     */
    System.out.println(jumps);
  }
}
