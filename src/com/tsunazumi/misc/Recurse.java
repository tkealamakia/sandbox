package com.tsunazumi.misc;

public class Recurse {
  public static void main(String[] args) {
    int count = 10;
    String a = "hello";
    String b = "hello";

    System.out.println(a == b);
    System.out.println(emptyBucket(count));

  }

  public static String emptyBucket(int count) {
    if (count == 0) {
      return "All empty";
    }
    return emptyBucket(--count);
  }
}
