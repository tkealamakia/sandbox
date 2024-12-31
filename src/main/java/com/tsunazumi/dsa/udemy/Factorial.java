package com.tsunazumi.dsa.udemy;

public class Factorial {

  public static void main(String[] args) {
    System.out.println(factorialInterative(5));
    System.out.println(factorialRecursive(5));
  }

  public static int factorialInterative(int num) {
    int result = 1;
    while (num > 1) {
      result = num * result;
      num = num - 1;
    }
    return result;
  }

  public static int factorialRecursive(int num) {
    if (num == 1) {
      return num;
    }
    return num * (factorialRecursive(num - 1));
  }
}
