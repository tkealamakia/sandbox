package com.tsunazumi.hackerrank;

public class CatAndMouse {

  public static void main(String[] args) {
    String result = catAndMouse(1,3,2);
    System.out.println(result);
  }

  static String catAndMouse(int x, int y, int z) {
    int a = Math.abs(z - x);
    int b = Math.abs(z - y);

    if (a == b) {
      return "Mouse C";
    } else if (a > b) {
      return "Cat B";
    }
    return "Cat A";

  }
}
