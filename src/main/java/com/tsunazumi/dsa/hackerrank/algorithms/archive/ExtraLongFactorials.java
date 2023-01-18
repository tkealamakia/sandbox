package com.tsunazumi.dsa.hackerrank.algorithms.archive;

import java.math.BigInteger;

public class ExtraLongFactorials {
  public static void main(String[] args) {
   extraLongFactorials(30);
  }

  public static void extraLongFactorials(int n) {
    BigInteger bi = new BigInteger(String.valueOf(n));
    n = n-1;
    while (n > 0) {
      BigInteger val = new BigInteger(String.valueOf(n));
      bi = bi.multiply(val);
      n--;
    }
    System.out.println(bi);
  }
}
