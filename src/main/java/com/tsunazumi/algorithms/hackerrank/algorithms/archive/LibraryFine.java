package com.tsunazumi.algorithms.hackerrank.algorithms.archive;

public class LibraryFine {
  public static void main(String[] args) {
    System.out.println(libraryFine(6, 6, 2015, 9, 6, 2016));
  }

  public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {

    // after year: 10,000
    if (y1 > y2) {
      return 10_000;
    }
    // after month but same year: 500 x months late
    if (y1 == y2 && m1 > m2) {
      return (m1-m2) * 500;
    }

    // after day but same month: 15 x days late
    if (y1 == y2 && m1 == m2) {
      if (d1 > d2) {
        return (d1-d2) * 15;
      }
    }

    return 0;
  }
}
