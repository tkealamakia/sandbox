package com.tsunazumi.dsa.hackerrank.algorithms.archive;

public class SherlockAndSquares {

  public static void main(String[] args) {
    System.out.println(squares(465868129, 988379794));
    System.out.println(squares(3, 9));
  }

  public static int squares(int a, int b) {
    double sa = Math.sqrt(a);
    double sb = Math.sqrt(b);

    Double v = Math.floor(sb) - Math.ceil(sa) + 1;
    return v.intValue();
  }

}
