package com.tsunazumi.dsa.hackerrank.algorithms.archive;

public class Taum {

  public static void main(String[] args) {
    System.out.println(taumBday(27984, 1402, 619246, 615589, 247954));
  }

  public static long taumBday(int b, int w, int bc, int wc, int z) {
    long bl = b;
    long wl = w;
    long bcl = bc;
    long wcl = wc;
    long zl = z;
    // find out if it's cost effective to convert black to white
    boolean convertBtoW = convert(bcl, wcl, zl);
    if (convertBtoW) {
      long blackTotal = bl * (wcl + zl);
      long whiteTotal = wl * wcl;

      return blackTotal + whiteTotal;
    }

    boolean convertWtoB = convert(wcl, bcl, zl);
    if (convertWtoB) {
      long blackTotal = bl * bcl;
      long whiteTotal = wl * (bcl + zl);
      return blackTotal + whiteTotal;
    }

    return (bl * bcl) + (wl * wcl);
  }

  public static boolean convert(long b, long w, long z) {
    if (b > w + z) {
      return true;
    }
    return false;
  }

}
