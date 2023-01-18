package com.tsunazumi.dsa.hackerrank.algorithms.archive;

public class Kangaroos {

  public static void main(String[] args) {
    //0 3 4 2
    //0 2 5 3
    //System.out.println(kangaroo(0, 3, 4, 2));
    System.out.println(kangaroo(0, 2, 5, 3));
  }

  static String kangaroo(int x1, int v1, int x2, int v2) {
    // perform jump then check position
    for (int i = 0; i <= 10000; i++) {
      if (x1 == x2) {
        return "YES";
      }
      x1 += v1;
      x2 += v2;
    }
    return "NO";
  }
}
